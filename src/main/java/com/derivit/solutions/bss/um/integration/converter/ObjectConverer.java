package com.derivit.solutions.bss.um.integration.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import com.derivit.solutions.bss.um.database.entity.UserEntity;
import com.derivit.solutions.bss.um.dataobject.UserDO;

/**
 * The Class ObjectConverer.
 * @author prabhat.jha
 */
@Component
public class ObjectConverer {

	/**
	 * Convert user entity to user do.
	 *
	 * @param userEntity the user entity
	 * @return the user do
	 */
	public UserDO convertUserEntityToUserDO(UserEntity userEntity) {
		UserDO userDO = new UserDO();
		userDO.setId(userEntity.getId());
		userDO.setBranch(userEntity.getBranch());
		userDO.setBusinessUnit(userEntity.getBusinessUnit());
		userDO.setCreatedBy(userEntity.getCreatedBy());
		userDO.setCreatedDate(userEntity.getCreatedDate());
		userDO.setDepartment(userEntity.getDepartment());
		userDO.setEmailId(userEntity.getEmailId());
		userDO.setEmployeeId(userEntity.getEmployeeId());
		userDO.setFirstName(userEntity.getFirstName());
		userDO.setLastName(userEntity.getLastName());
		userDO.setLocation(userEntity.getLocation());
		userDO.setModifiedBy(userEntity.getModifiedBy());
		userDO.setModifiedDate(userEntity.getModifiedDate());
		userDO.setPassword(userEntity.getPassword());
		userDO.setStatus(userEntity.getStatus());
		userDO.setUsername(userEntity.getUsername());
		return userDO;
	}
	
	/**
	 * Convert user do to user entity.
	 *
	 * @param userDO the user do
	 * @return the user entity
	 */
	public UserEntity convertUserDOToUserEntity(UserDO userDO) {
		UserEntity userEntity = new UserEntity();
		userEntity.setId(userDO.getId());
		userEntity.setBranch(userDO.getBranch());
		userEntity.setBusinessUnit(userDO.getBusinessUnit());
		userEntity.setCreatedBy(userDO.getCreatedBy());
		userEntity.setCreatedDate(userDO.getCreatedDate());
		userEntity.setDepartment(userDO.getDepartment());
		userEntity.setEmailId(userDO.getEmailId());
		userEntity.setEmployeeId(userDO.getEmployeeId());
		userEntity.setFirstName(userDO.getFirstName());
		userEntity.setLastName(userDO.getLastName());
		userEntity.setLocation(userDO.getLocation());
		userEntity.setModifiedBy(userDO.getModifiedBy());
		userEntity.setModifiedDate(userDO.getModifiedDate());
		userEntity.setPassword(userDO.getPassword());
		userEntity.setStatus(userDO.getStatus());
		userEntity.setUsername(userDO.getUsername());
		return userEntity;
	}
	
	/**
	 * Convert user entities to user d os.
	 *
	 * @param userEntities the user entities
	 * @return the list
	 */
	public List<UserDO> convertUserEntitiesToUserDOs(List<UserEntity> userEntities) {
		if(CollectionUtils.isEmpty(userEntities)){
			return Collections.emptyList();
		}
		List<UserDO> returnVal = new ArrayList<UserDO>(userEntities.size());
		for(UserEntity userEntity : userEntities) {
			returnVal.add(convertUserEntityToUserDO(userEntity));
		}
		return returnVal;
	}
	
	/**
	 * Convert user d os to user entities.
	 *
	 * @param userDOs the user d os
	 * @return the list
	 */
	public List<UserEntity> convertUserDOsToUserEntities(List<UserDO> userDOs) {
		if(CollectionUtils.isEmpty(userDOs)){
			return Collections.emptyList();
		}
		List<UserEntity> returnVal = new ArrayList<UserEntity>(userDOs.size());
		for(UserDO userDO : userDOs) {
			returnVal.add(convertUserDOToUserEntity(userDO));
		}
		return returnVal;
	}
}