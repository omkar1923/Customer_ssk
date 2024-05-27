package ssk.example_Customer.repo;

//import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import ssk.example_Customer.dto.Customer;

public interface Repo extends JpaRepository<Customer,Integer>{
	

}
