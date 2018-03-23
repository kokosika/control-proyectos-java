package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.TaskDto;
import com.example.demo.repository.interfaces.custom.ITaskRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class TaskRepository extends BaseRepository implements ITaskRepository{

	@SuppressWarnings("unchecked")
	public List<TaskDto> getAllTask(Integer id){
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", id);
		return (List<TaskDto>) executeList(TaskDto.class, "PRC_TASK", params); 
	}
	
}
