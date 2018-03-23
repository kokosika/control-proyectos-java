package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.IBaseService;

public interface IAssignmentService extends IBaseService {
	
	public ResponseEntity<GenericResponse> getAllOcupation(Integer id);
	public ResponseEntity<GenericResponse> getPorcenAsigForUser(Integer id);

}
