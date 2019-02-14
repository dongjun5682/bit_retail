package domain;
import lombok.Data;

public @Data class EmployeeDTO {
	private String employeeID,
					manager,
					name,
					birthDate,
					photo,
					notes;
}
