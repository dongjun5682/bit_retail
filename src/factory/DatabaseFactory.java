package factory;

import enums.Vender;

public class DatabaseFactory {
	public static Database createDatabase(Vender v){
		Database db =null;
		
		switch (v) {
		case ORACLE:
			db = new Oracle();
			break;
		default:
			break;
		}
		return db;
	}
}
