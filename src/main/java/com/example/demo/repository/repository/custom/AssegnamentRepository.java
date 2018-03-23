package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.custom.AssegnamentDto;
import com.example.demo.repository.interfaces.custom.IAssegnamentRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class AssegnamentRepository extends BaseRepository implements IAssegnamentRepository {

	@SuppressWarnings("unchecked")
	@Override	
	public List<AssegnamentDto> getAllAsegnamentProyect(Integer id) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", id);
		return (List<AssegnamentDto>) executeList(AssegnamentDto.class, "PRC_GET_ASIGNACIONES",params);
	}
	
	
}
