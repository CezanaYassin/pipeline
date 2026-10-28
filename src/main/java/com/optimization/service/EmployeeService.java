package com.optimization.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.optimization.entity.EmployeeEntity;
import com.optimization.repository.EmployeeRepository;
import com.optimization.request.EmployeeRequest;
import com.optimization.response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public void createEmployee(EmployeeRequest request)
	{
		EmployeeEntity entity=new EmployeeEntity();
		
		entity.setName(request.getName());
		entity.setEmail(request.getEmail());
		
		EmployeeEntity savedData=repository.save(entity);
				
	}
	
	public List<EmployeeEntity> getAllEmployees()
	{
		Sort sort=Sort.by("name");
		
	    Pageable page = PageRequest.of(0, 5, sort);

	    Page<EmployeeEntity> result = repository.findAll(page);

	    return result.getContent();
	}
	
	public EmployeeResponse getAllEmployees(
	        int pageNo,
	        int pageSize,
	        String sortBy,
	        String sortDir,
	        String search) {

	    Sort sort;

	    if (sortDir.equalsIgnoreCase("ASC")) {
	        sort = Sort.by(sortBy).ascending();
	    } else {
	        sort = Sort.by(sortBy).descending();
	    }

	    Pageable page = PageRequest.of(pageNo, pageSize, sort);

	    Page<EmployeeEntity> result;

	    if (search == null) {
	        result = repository.findAll(page);
	    } else {
	        result = repository.findByName(search, page);
	    }
	    
	    EmployeeResponse response=new EmployeeResponse();
	    
	    response.setContent(result.getContent());
	    response.setFirst(result.isFirst());
	    response.setLast(result.isLast());
	    response.setTotalPages(result.getTotalPages());
	    response.setPageNo(result.getNumber());
	    response.setTotalElements(result.getTotalElements());
	    response.setPageSize(result.getSize());
	    

	    return response;
	}
	
	public EmployeeEntity getById(int id)
	{
		EmployeeEntity entity=repository.findById(id).get();
		return entity;
	}

}
