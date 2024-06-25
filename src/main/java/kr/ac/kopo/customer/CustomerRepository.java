package kr.ac.kopo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    Customer findByEmail(String email);
}
