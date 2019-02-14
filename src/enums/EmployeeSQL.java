package enums;

public enum EmployeeSQL {
	REGISTER,TEST,ACCESS;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case REGISTER:
			query.append("INSERT INTO EMPLOYEES (EMPLOYEE_ID,MANAGER,NAME,BIRTH_DATE,PHOTO,NOTES)"
            + "VALUES(EMP_SEQ.NEXTVAL, ?, ?, ?, ?, ?)");
			break;
		case TEST:
			query.append("SELECT COUNT(*) AS COUNT FROM EMPLOYEES");
			break;
		case ACCESS:
			query.append("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID LIKE ? AND NAME LIKE ?");
			break;
	
		default:
			break;
		}
		return query.toString();
	}
}
