package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.ICustomRepository;
import com.example.demo.service.interfaces.custom.ICustomService;
import com.example.demo.service.services.BaseService;

@Service
public class CustomService extends BaseService implements ICustomService {

	@Autowired
	private ICustomRepository repository;

	@Override
	public ResponseEntity<GenericResponse> getAllProyect() {
		try {
			return ok(this.repository.getAllProyect());
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	
	
}
