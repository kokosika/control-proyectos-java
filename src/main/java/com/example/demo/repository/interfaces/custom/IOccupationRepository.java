package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.OccupationDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IOccupationRepository extends IBaseRepository {
	
	public List<OccupationDto> getAllOccupation();

}
