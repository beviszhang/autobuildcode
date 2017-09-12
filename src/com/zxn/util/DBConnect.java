package com.zxn.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: Mysql 数据库工具类
 * @author ZhangXiaoNan
 * @date 2017年9月12日 下午5:29:03
 */
public class DBConnect {
	private static String dbURL = "";
	private static String databaseName = "";
	private static String dbUser = "";
	private static String dbPassword = "";

	/**
	 * @Description: 获取数据库连接
	 * @author ZhangXiaoNan
	 * @date 2017年9月12日 下午5:29:22
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://" + dbURL + ":3306/" + databaseName
					+ "?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8";
			String user = dbUser;
			String pass = dbPassword;
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * @Description: 获取数据库表信息
	 * @author ZhangXiaoNan
	 * @date 2017年9月12日 下午5:30:29
	 * @return
	 */
	@SuppressWarnings("unused")
	public static List<List<Map<String, Object>>> getAll() {
		Connection conn = getConnection();

		List<List<Map<String, Object>>> listListss = new ArrayList<List<Map<String, Object>>>();

		try {
			DatabaseMetaData dbMetaData = getConnection().getMetaData();
			ResultSet rsTables = dbMetaData.getTables(conn.getCatalog(), dbUser, null, new String[] { "TABLE", "VIEW" });

			while (rsTables.next()) {
				String tableName = rsTables.getString("TABLE_NAME");
				String pkName = null;// 主键名称(只适用表里只有一个主键) 可能为空
				/**
				 * 获取主键
				 */
				ResultSet primaryKeyResultSet = dbMetaData.getPrimaryKeys(conn.getCatalog(), dbUser, tableName);
				while (primaryKeyResultSet.next()) {
					pkName = primaryKeyResultSet.getString("COLUMN_NAME");
				}

				ResultSet rsColumns = dbMetaData.getColumns(conn.getCatalog(), dbUser, tableName, null);
				List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
				int i = 0;
				while (rsColumns.next()) {
					Map<String, Object> map = new HashMap<String, Object>();

					String tableCat = rsColumns.getString("TABLE_CAT");// 表目录（可能为空）
					String tableSchemaName = rsColumns.getString("TABLE_SCHEM");// 表的架构（可能为空）
					String tableName_ = rsColumns.getString("TABLE_NAME");// 表名
					String columnName = rsColumns.getString("COLUMN_NAME").toLowerCase();// 列名
					int dataType = rsColumns.getInt("DATA_TYPE"); // 对应的java.sql.Types类型
					String dataTypeName = rsColumns.getString("TYPE_NAME");// java.sql.Types类型名称
					int columnSize = rsColumns.getInt("COLUMN_SIZE");// 列大小
					int decimalDigits = rsColumns.getInt("DECIMAL_DIGITS");// 小数位数
					int numPrecRadix = rsColumns.getInt("NUM_PREC_RADIX");// 基数（通常是10或2）
					int nullAble = rsColumns.getInt("NULLABLE");// 是否允许为null
					String remarks = rsColumns.getString("REMARKS");// 列描述
					String columnDef = rsColumns.getString("COLUMN_DEF");// 默认值
					int sqlDataType = rsColumns.getInt("SQL_DATA_TYPE");// sql数据类型
					int sqlDatetimeSub = rsColumns.getInt("SQL_DATETIME_SUB"); // SQL日期时间分?
					int charOctetLength = rsColumns.getInt("CHAR_OCTET_LENGTH"); // char类型的列中的最大字节数
					int ordinalPosition = rsColumns.getInt("ORDINAL_POSITION"); // 表中列的索引（从1开始）
					String isNullAble = rsColumns.getString("IS_NULLABLE");// ISO规则用来确定某一列的为空性。 是---如果该参数可以包括空值; 无---如果参数不能包含空值 ;
																			// 空字符串---如果参数为空性是未知的
					String isAutoincrement = rsColumns.getString("IS_AUTOINCREMENT");// 指示此列是否是自动递增
																						// 是---如果该列是自动递增;无---如果不是自动递增列;空字串---如果不能确定它是否;列是自动递增的参数是未知

					map.put("dataBaseName", databaseName);
					map.put("tableDBName", tableName);
					String[] tableNames = tableName.split("_");
					for (int j = 0; j < tableNames.length; j++) {
						if (j == 0) {
							tableName = tableNames[j];
						} else {
							tableName += tableNames[j].substring(0, 1).toUpperCase() + tableNames[j].substring(1);
						}
					}
					map.put("tableName", tableName);
					map.put("pkName", pkName);// 主键名称 可能为空

					int isPk = 0;// 非主键
					if (columnName.equals(pkName)) {
						isPk = 1;// 主键
					}
					map.put("isPk", isPk);// 是否主键 0-非 1-是
					// 获得所有列的数目及实际列数
					ResultSetMetaData rsDatas = rsColumns.getMetaData();
					map.put("columnCount", rsDatas.getColumnCount());
					// 获得指定列的列名
					map.put("columnDBName", columnName);// DB列名
					String[] columnLabels = columnName.split("_");
					for (int j = 0; j < columnLabels.length; j++) {
						if (j == 0) {
							columnName = columnLabels[j].toLowerCase();
						} else {
							columnName += columnLabels[j].toLowerCase().substring(0, 1).toUpperCase()
									+ columnLabels[j].toLowerCase().substring(1);
						}
					}
					map.put("columnName", columnName);// 列名
					map.put("columnNameUpper", columnName.toUpperCase().substring(0, 1).toUpperCase() + columnName.substring(1));
					map.put("colunmIndex", i);
					// 获得指定列的数据类型
					map.put("columnType", String.valueOf(rsColumns.getObject("DATA_TYPE")));
					// 获得指定列的数据类型名
					switch (dataTypeName) {
					case "INT":
						map.put("columnTypeName", "INTEGER");
						break;
					case "DATETIME":
						map.put("columnTypeName", "TIMESTAMP");
						break;
					case "TEXT":
						map.put("columnTypeName", "VARCHAR");
						break;
					default:
						map.put("columnTypeName", String.valueOf(rsColumns.getObject("TYPE_NAME")));
						break;
					}

					// 对应数据类型的类
					map.put("dataType", dataType);
					map.put("dataTypeName", dataTypeName);
					String columnClassName = getClassNameForJavaType(dataType);
					map.put("columnClassFullName", columnClassName);
					map.put("columnClassName", columnClassName.substring(columnClassName.lastIndexOf(".") + 1));
					// 在数据库中类型的最大字符个数
					map.put("columnDisplaySize", charOctetLength);
					// 默认的列的标题
					map.put("columnLabel", remarks);
					// 是否自动递增
					map.put("isAutoInctement", isAutoincrement);
					i++;

					listMap.add(map);
				}

				listListss.add(listMap);
			}

			return listListss;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("数据库连接失败");
			return null;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @Description: 数据库类型 转换java数据类型
	 * @author ZhangXiaoNan
	 * @date 2017年9月12日 下午5:31:02
	 * @param javaType
	 * @return
	 */
	private static String getClassNameForJavaType(int javaType) {
		switch (javaType) {
		case -7:
		case 16:
			return "java.lang.Boolean";
		case -6:
		case 5:
		case 4:
			return "java.lang.Integer";
		case -5:
			return "java.math.BigInteger";
		case 3:
			return "java.math.BigDecimal";
		case 7:
			return "java.lang.Float";
		case 6:
		case 8:
		case 22:
			return "java.lang.Double";
		case -1:
		case 1:
		case 12:
		case -4:
		case -3:
		case -2:
			return "java.lang.String";
		case 91:
		case 93:
			return "java.sql.Date";
		case 92:
			return "java.sql.Time";
			// case 93:
			// return "java.sql.Timestamp";
		}

		return "java.lang.Object";
	}

	// ------------------------------get and set-----------------------------------------------
	public static String getDbURL() {
		return dbURL;
	}

	public static void setDbURL(String dbURL) {
		DBConnect.dbURL = dbURL;
	}

	public static String getDatabaseName() {
		return databaseName;
	}

	public static void setDatabaseName(String databaseName) {
		DBConnect.databaseName = databaseName;
	}

	public static String getDbUser() {
		return dbUser;
	}

	public static void setDbUser(String dbUser) {
		DBConnect.dbUser = dbUser;
	}

	public static String getDbPassword() {
		return dbPassword;
	}

	public static void setDbPassword(String dbPassword) {
		DBConnect.dbPassword = dbPassword;
	}
}