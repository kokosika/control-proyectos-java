package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.TaskDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface ITaskRepository extends IBaseRepository {

	public List<TaskDto> getAllTask(Integer id);
	
}
