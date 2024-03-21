package net.kdigital.jquery2.ajexTest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.kdigital.jquery2.ajexTest.dto.CustomerDTO;
import net.kdigital.jquery2.ajexTest.entity.CustomerEntity;
import net.kdigital.jquery2.ajexTest.repository.CustomerRepository;


@RequiredArgsConstructor // 반드시 final 이어야한다 
@Service

/**
 * 전달받은 DTO를 Entity로 변환하여 DB에 save한 후 
 *save 완료된 객체를 다시 받아 반환 
 *@param customerDTO
 *@return
 */
public class CustomerService {
	
	private final CustomerRepository repository;

	public CustomerDTO insert(CustomerDTO customerDTO) {
		CustomerEntity entity = CustomerEntity.toEntity(customerDTO);
		
		return CustomerDTO.toDTO(repository.save(entity));
	}
	
	/**
	 * 등록된모든 고객정보를 조회 
	 * @return
	 */
	public List<CustomerDTO> selectAll() {
		List<CustomerEntity> entitylist = repository.findAll();
		List<CustomerDTO> result = new ArrayList<>(); 
		entitylist.forEach(entity -> result.add(CustomerDTO.toDTO(entity)));
		return result;
	}
	/**
	 * 전달받은 customerNum의 고객정보를 삭제 
	 * @param customerNum
	 */

	public boolean delete(Long customerNum) {
		
		repository.deleteById(customerNum); // void이므로 진짜 삭제 되었는지 인을 해봐야한다-> exist 
		// 삭제가 안되었으면 true 삭제가 되면 false : 데이터가 없어 졌으므로 false를 반환해야한다 
		return !repository.existsById(customerNum); // 삭제되었는지 여부 / 존재하니 ??  
	}

}
