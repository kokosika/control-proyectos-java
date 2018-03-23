package com.example.demo.repository.repository.custom;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.repository.interfaces.custom.ICustomRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class CustomRepository extends BaseRepository implements ICustomRepository{

	@SuppressWarnings("unchecked")
	@Override	
	public List<ProyectDto> getAllProyect() {
		return (List<ProyectDto>) executeList(ProyectDto.class, "PRC_PROYECTOS");
	}

}
