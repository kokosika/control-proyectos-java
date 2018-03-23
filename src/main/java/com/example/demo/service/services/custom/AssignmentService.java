package com.example.demo.service.services.custom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.OccupationDto;
import com.example.demo.dto.custom.UserForOccupation;
import com.example.demo.repository.interfaces.custom.IAssegnamentRepository;
import com.example.demo.repository.interfaces.custom.IOccupationRepository;
import com.example.demo.repository.interfaces.custom.IUserRepository;
import com.example.demo.service.interfaces.custom.IAssignmentService;
import com.example.demo.service.services.BaseService;

import net.bytebuddy.asm.Advice.This;

@Service
public class AssignmentService extends BaseService implements IAssignmentService {
	
	@Autowired
	private IUserRepository userRepo;
	@Autowired
	private IOccupationRepository occupationRepo;
	@Autowired
	private IAssegnamentRepository asseRepo;
	
	public ResponseEntity<GenericResponse> getAllOcupation(Integer id){		
		try {
			List<OccupationDto> ocupation = this.occupationRepo.getAllOccupation();
			List<UserForOccupation> user = this.userRepo.getAllUserOcupation(id);				
			for (int i = 0; i < ocupation.size(); i++) {
				List<UserForOccupation> result = new ArrayList<>();
				for(int j = 0; j < user.size(); j++) {					
					if(ocupation.get(i).getId() == user.get(j).getId_cargo()) {
						result.add(user.get(j));
					}
				}
				if(!result.isEmpty()) {
					ocupation.get(i).setChildren(result);
				}
			}
			return ok(ocupation);			
		} catch (Exception e) {
			return customException(e);
		}
		
	}
	
	public ResponseEntity<GenericResponse> getPorcenAsigForUser(Integer id){
		try {
			return ok(this.asseRepo.getAllAsegnamentProyect(id));
		} catch (Exception e) {
			return customException(e);
		}
	}

}
