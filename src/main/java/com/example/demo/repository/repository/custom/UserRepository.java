package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.UserDto;
import com.example.demo.dto.custom.UserForOccupation;
import com.example.demo.repository.interfaces.custom.IUserRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class UserRepository extends BaseRepository implements IUserRepository {

	/**
	 * 
	 * @param user
	 * @return
	 */
	public UserDto validateLogin(UserDto user) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("NOMBRE", user.getNombre());
		params.put("PASS", user.getPass());
		@SuppressWarnings("unchecked")
		List<UserDto> obj = (List<UserDto>) executeList(UserDto.class, "PRC_LOGIN", params);
		if (obj.isEmpty())
			return null;
		else
			return obj.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<UserForOccupation> getAllUserOcupation(Integer id){
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", id);		
		return (List<UserForOccupation>) executeList(UserForOccupation.class, "PRC_USUARIO_X_CARGO", params);
	}

}
