package enums;

public enum CustomerSQL {
	SIGNUP,SIGNIN,LIST,COUNT,RETRIEVE,UPLOAD_FILE,UPDATE_PHOTO;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case SIGNUP:
			query.append("INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,ADDRESS,CITY,POSTAL_CODE,SSN,PHONE)"
            + "VALUES(?,?, ?, ?, ?, ?,?,?)");
			break;
		case SIGNIN:
			query.append("SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID LIKE ? AND PASSWORD LIKE ?");
			break;
		case LIST:
			query.append("SELECT T2.*\n" + 
					"FROM(SELECT ROWNUM R2,T.*\n" + 
					"        FROM (SELECT ROWNUM RNUM ,C.* \n" + 
					"        FROM CUSTOMERS C  \n" + 
					"        ORDER BY RNUM DESC) T) T2  \n" + 
					"WHERE R2 BETWEEN ? AND ? \n");
			break;
		case COUNT:
			query.append("SELECT COUNT(*) AS COUNT FROM CUSTOMERS");
			break;
		case RETRIEVE:
			query.append("SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID LIKE ?");
			break;
		case UPDATE_PHOTO:
			query.append("UPDATE CUSTOMERS SET PHOTO = ? WHERE CUSTOMER_ID LIKE ?");
		default:
			break;
		}
		return query.toString();
	}
}
