package net.kdigital.jquery2.ajexTest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.kdigital.jquery2.ajexTest.entity.CustomerEntity;

@NoArgsConstructor
@AllArgsConstructor
@Builder 
@ToString
@Getter
@Setter
public class CustomerDTO {
	private Long customerNum;
	private String username; 
	private String email;
	
	
public static CustomerDTO toDTO(CustomerEntity customerEntity) {
		
		
		return CustomerDTO.builder()
				.customerNum(customerEntity.getCustomerNum())
				.username(customerEntity.getUsername())
				.email(customerEntity.getEmail())
				.build();
	}
	

}
