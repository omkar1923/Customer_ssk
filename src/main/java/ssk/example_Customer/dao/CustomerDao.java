package ssk.example_Customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ssk.example_Customer.dto.Customer;
import ssk.example_Customer.repo.Repo;

@Repository
public class CustomerDao {
	@Autowired
	Repo repo;

	public Customer saveData(Customer customer) {
		return repo.save(customer);

	}

	public Customer getData(int id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	public List<Customer> getDataAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
