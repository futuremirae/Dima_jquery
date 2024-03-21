package net.kdigital.jquery2.ajexTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.kdigital.jquery2.ajexTest.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
