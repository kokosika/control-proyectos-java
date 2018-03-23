package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface ICustomRepository extends IBaseRepository {

	public List<ProyectDto> getAllProyect();
	
}
