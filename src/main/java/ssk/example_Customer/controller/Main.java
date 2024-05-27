package ssk.example_Customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ssk.example_Customer.dao.CustomerDao;
import ssk.example_Customer.dto.Customer;
@RestController
public class Main {
	@Autowired
	private CustomerDao dao;
	@PostMapping("/save")
	public Customer saveData(@RequestBody Customer customer) {
		return dao.saveData(customer);
	}
	@GetMapping("/getById")
	public Customer GetData(@RequestParam int id) {
		return dao.getData(id);
	}
	@GetMapping("/getAll")
	public List<Customer> GetData() {
		return dao.getDataAll();
	}

}
