package com.optimization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.optimization.entity.EmployeeEntity;
import com.optimization.request.EmployeeRequest;
import com.optimization.response.EmployeeResponse;
import com.optimization.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping
	public ResponseEntity<Void> createEmployee(@RequestBody EmployeeRequest request) {

	    service.createEmployee(request);

	    return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping
	public ResponseEntity<EmployeeResponse> createEmployee(@RequestParam(required = false,defaultValue = "1")int pageNo,
															   @RequestParam(required = false,defaultValue = "3") int pageSize,
															   @RequestParam(required = false,defaultValue ="id")String sortBy,
															   @RequestParam(required = false,defaultValue = "asc") String sortDir,
															   @RequestParam(required = false) String search){

	    return ResponseEntity.ok(service.getAllEmployees(pageNo,pageSize,sortBy,sortDir,search));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeEntity> createEmployee(@PathVariable int id){

	    return ResponseEntity.ok(service.getById(id));
	}
	

}
