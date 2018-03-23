package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.AssegnamentDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IAssegnamentRepository extends IBaseRepository {
	public List<AssegnamentDto> getAllAsegnamentProyect(Integer id) ;
}
