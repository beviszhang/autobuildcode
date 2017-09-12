package com.zxn.auto;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zxn.util.DBConnect;
import com.zxn.util.DelAllFile;
import com.zxn.util.FileZip;
import com.zxn.util.Freemarker;
import com.zxn.util.PathUtil;

public class BuildSpringJdbcCode {
	public static Object printCode(String dbUrl, String dbName, String dbUser, String dbPassword, String tableName) throws Exception {
		DBConnect.setDbURL(dbUrl);
		DBConnect.setDatabaseName(dbName);
		DBConnect.setDbUser(dbUser);
		DBConnect.setDbPassword(dbPassword);
		List<List<Map<String, Object>>> listListss = DBConnect.getAll();

		DelAllFile.delFolder(PathUtil.getClasspath() + "code/springjdbc"); // 生成代码前,先清空之前生成的代码

		String filePath = "code/springjdbc/temp/"; // 存放路径
		String ftlPath = "com/zxn/ftl/springjdbc"; // ftl路径
		String zipPath = "code/springjdbc/springJdbcCode.zip"; // ftl路径
		boolean tableFlag = false;// 表不存在
		for (List<Map<String, Object>> listMap : listListss) {
			String packageName = listMap.get(0).get("dataBaseName").toString(); // 包名(数据库名)
			String objectName = listMap.get(0).get("tableName").toString(); // 类名(表名)
			String tableDBName = listMap.get(0).get("tableDBName").toString();

			if (tableName != null && !"".equals(tableName)) {// 处理指定'表'生成
				boolean flag = false;// 停止
				String[] tableNames = tableName.split(",");
				for (String str : tableNames) {
					if (tableDBName.equals(str)) {
						flag = true;// 找到指定表,生成该表
						break;
					}
				}
				if (!flag) {
					continue;// 非指定'表',不生成
				}
			}
			tableFlag = true;// 表存在
			Map<String, Object> root = new HashMap<String, Object>(); // 创建数据模型
			root.put("fieldList", listMap);
			root.put("columnNumber", listMap.size());
			root.put("packageName", packageName.toLowerCase()); // 包名
			root.put("tblName", tableDBName ); // 表名
			String objectNameUpper = objectName.substring(0, 1).toUpperCase() + objectName.substring(1);
			root.put("objectNameUpper", objectNameUpper); // 类名
			root.put("objectName", objectName); // 类变量名
			root.put("nowDate", new Date()); // 当前日期

			// 生成 接口说明&实体&映射
			Freemarker.printFile("entity.ftl", root, "entity/" + objectNameUpper + ".java", filePath, ftlPath);
			// Freemarker.printFile("entityCriteria.ftl", root, "entity/" + packageName + "/" + objectNameUpper + "Criteria.java", filePath,
			// ftlPath);
			// Freemarker.printFile("mapper.ftl", root, "dao/" + packageName + "/" + objectNameUpper + "Mapper.java", filePath, ftlPath);
			// Freemarker.printFile("mapperXML.ftl", root, "dao/" + packageName + "/" + objectNameUpper + "Mapper.xml", filePath, ftlPath);
			//
			// /* 生成service */
			// Freemarker.printFile("IserviceTemplate.ftl", root, "service/" + packageName + "/I" + objectNameUpper + "Service.java",
			// filePath, ftlPath);
			// Freemarker.printFile("serviceImplTemplate.ftl", root, "service/" + packageName + "/impl/" + objectNameUpper
			// + "ServiceImpl.java", filePath, ftlPath);
			//
			// // 生成controller
			// Freemarker.printFile("adminControllerTemplate.ftl", root, "controller/" + packageName + "/" + objectNameUpper
			// + "Controller.java", filePath, ftlPath);
			// Freemarker.printFile("appControllerTemplate.ftl", root, "controller/" + packageName + "/app/App" + objectNameUpper
			// + "Controller.java", filePath, ftlPath);
			//
			// // 生成html
			// Freemarker.printFile("html_list_Template.ftl", root,
			// "page/" + packageName + "/" + objectName + "/" + objectName + "_list.html", filePath, ftlPath);
			// /*
			// * Freemarker.printFile("html_add_Template.ftl", root, "page/"
			// * + packageName + "/" + objectName +"/"+ objectName + "_add.html", filePath,
			// * ftlPath);
			// */
			// Freemarker.printFile("html_edit_Template.ftl", root,
			// "page/" + packageName + "/" + objectName + "/" + objectName + "_edit.html", filePath, ftlPath);
			// Freemarker.printFile("html_view_Template.ftl", root,
			// "page/" + packageName + "/" + objectName + "/" + objectName + "_view.html", filePath, ftlPath);
			//
			// // 生成js
			// Freemarker.printFile("js_list_Template.ftl", root, "page/" + packageName + "js/" + objectName + "/" + objectName +
			// "_list.js",
			// filePath, ftlPath);
			// Freemarker.printFile("js_add_Template.ftl", root, "page/" + packageName + "js/" + objectName + "/" + objectName + "_add.js",
			// filePath, ftlPath);
			// Freemarker.printFile("js_edit_Template.ftl", root, "page/" + packageName + "js/" + objectName + "/" + objectName +
			// "_edit.js",
			// filePath, ftlPath);
			// Freemarker.printFile("js_view_Template.ftl", root, "page/" + packageName + "js/" + objectName + "/" + objectName +
			// "_view.js",
			// filePath, ftlPath);
		}
		if (!tableFlag) {
			return "Table Not Exits!";
		}
		/* 生成的全部代码压缩成zip文件 */
		FileZip.zip(PathUtil.getClasspath() + filePath, PathUtil.getClasspath() + zipPath);

		/* 下载代码 */
		// FileDownload.fileDownload(response, PathUtil.getClasspath() + "admin/ftl/code.zip", "code.zip");
		System.out.println("已生成代码!   --BuildSpringJdbc.java");
		return "success";
	}

	public static void main(String[] args) {
		try {
			printCode("172.16.0.4", "lemonschool_test", "root", "zkpk", null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
