package domain;
import lombok.Data;

public @Data class OrderDTO {
	private String orderId,
					orderDate,
					customerId,
					shipperId,
					employeelId;
}
