package enums;

public enum CategorySQL {
	LIST;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case LIST:
			query.append("SELECT T2.*\n" + 
					"FROM(SELECT ROWNUM R2,T.*\n" + 
					"        FROM (SELECT ROWNUM RNUM ,C.* \n" + 
					"        FROM CATEGORIES C  \n" + 
					"        ORDER BY RNUM DESC) T) T2  \n" + 
					"WHERE R2 BETWEEN ? AND ? \n");
			break;
		default:
			break;
		}
		return query.toString();
	}
	
}
