package com.example.demo.repository.repository.custom;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.OccupationDto;
import com.example.demo.repository.interfaces.custom.IOccupationRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class OccupationRepository extends BaseRepository implements IOccupationRepository {
	
	@SuppressWarnings("unchecked")
	public List<OccupationDto> getAllOccupation(){		
		return (List<OccupationDto>) executeList(OccupationDto.class, "PRC_CARGO"); 
	}

}
