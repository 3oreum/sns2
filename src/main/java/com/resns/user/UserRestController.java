package com.resns.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.resns.user.bo.UserBO;
import com.resns.user.entity.UserEntity;

@RequestMapping("/user")
@RestController
public class UserRestController { // API
	
	@Autowired
	private UserBO userBO;

	// 중복확인
	@RequestMapping("/is-duplicated-id")
	public Map<String, Object> isDuplicatedId(
			@RequestParam("loginId") String loginId){
		
		Map<String, Object> result = new HashMap<>();
		result.put("isDuplicatedId", false);
		
		// DB select
		UserEntity userEntity = userBO.getUserEntityByLoginId(loginId);
		result.put("code", 200);
		
		if (userEntity != null) { // 중복일 때
			result.put("isDuplicatedId", true);
		}
		
		return result;
	}
}
