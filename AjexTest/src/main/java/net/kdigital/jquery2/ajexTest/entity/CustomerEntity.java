package net.kdigital.jquery2.ajexTest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.kdigital.jquery2.ajexTest.dto.CustomerDTO;

@NoArgsConstructor
@AllArgsConstructor
@Builder 
@ToString
@Getter
@Setter
@Entity
@Table(name="customer")
public class CustomerEntity {
	@SequenceGenerator(
			name="customer_seq"
			,sequenceName = "customer_seq"
			,initialValue = 1
			,allocationSize = 1)
	@Id
	@Column(name="customer_num")
	@GeneratedValue(generator="customer_seq")
	private Long customerNum;
	
	@Column(name="username")
	private String username; 
	
	@Column(name="email")
	private String email;
	
	public static CustomerEntity toEntity(CustomerDTO customerDTO) {
		
		
		return CustomerEntity.builder()
				.customerNum(customerDTO.getCustomerNum())
				.username(customerDTO.getUsername())
				.email(customerDTO.getEmail())
				.build();
	}
	
	

}