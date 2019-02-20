package enums;

public enum ImageSQL {
	UPLOAD_FILE,LAST_SEQ;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case UPLOAD_FILE:
			query.append("INSERT INTO IMAGE(IMG_SEQ,IMG_NAME,IMG_EXTENTION,OWNER) "
					+ "VALUES(EMP_SEQ.NEXTVAL,?,?,?)");
			break;
		case LAST_SEQ:
			query.append("SELECT T2.* FROM"
					+ "(SELECT ROWNUM R2,T.* FROM "
					+ "(SELECT ROWNUM R1,C.* FROM IMAGE C ORDER BY R1 DESC)T) T2 "
					+ "WHERE R2 <=1");
			break;
		default:
			break;
		}
		return query.toString();
	}

}
