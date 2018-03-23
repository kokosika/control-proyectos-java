package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.UserDto;
import com.example.demo.dto.custom.UserForOccupation;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IUserRepository extends IBaseRepository {

	/**
	 * 
	 * @param user
	 * @return
	 */
	public UserDto validateLogin(UserDto user);
	
	public List<UserForOccupation> getAllUserOcupation(Integer id);
}
