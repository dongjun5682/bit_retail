package enums;

public enum ProductSQL {
	INSERT,LIST;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case INSERT:
			query.append("INSERT INTO PRODUCTS\n"
					+ "VALUES(product_id.NEXTVAL,?,?,?,?,?,'1001')");
			break;
		case LIST:
			query.append("SELECT T2.*\n" + 
					"FROM(SELECT ROWNUM R2,T.*\n" + 
					"        FROM (SELECT ROWNUM RNUM ,C.* \n" + 
					"        FROM PRODUCTS C  \n" + 
					"        ORDER BY RNUM DESC) T) T2  \n" + 
					"WHERE R2 BETWEEN ? AND ? \n");
			break;
		default:
			break;
		}
		return query.toString();
	}
}
