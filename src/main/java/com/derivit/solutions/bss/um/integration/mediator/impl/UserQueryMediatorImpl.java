package com.derivit.solutions.bss.um.integration.mediator.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.derivit.solutions.bss.um.database.entity.UserEntity;
import com.derivit.solutions.bss.um.database.exception.DatabaseException;
import com.derivit.solutions.bss.um.database.service.IUserService;
import com.derivit.solutions.bss.um.dataobject.UserDO;
import com.derivit.solutions.bss.um.integration.converter.ObjectConverer;
import com.derivit.solutions.bss.um.integration.mediator.IUserQueryMediator;
import com.derivit.solutions.bss.um.integration.mediator.exception.MediatorException;
import com.derivit.solutions.bss.um.integration.mediator.exception.helper.ExceptionHelper;

/**
 * The Class UserQueryMediatorImpl.
 * @author prabhat.jha
 */
@Service(value = "userQueryMediator")
public class UserQueryMediatorImpl implements IUserQueryMediator {

	/** The user service. */
	@Autowired
	private IUserService	userService		= null;

	/** The object converter. */
	@Autowired
	private ObjectConverer	objectConverter	= null;

	/* (non-Javadoc)
	 * @see com.derivit.solutions.bss.um.integration.mediator.IUserQueryMediator#findUserById(java.lang.Long)
	 */
	@Override
	public UserDO findUserById(Long id) throws MediatorException {
		try {
			UserEntity userEntity = this.userService.findUserById(id);
			return this.objectConverter.convertUserEntityToUserDO(userEntity);
		} catch (DatabaseException e) {
			throw ExceptionHelper.getTransactionFromException(e);
		}
	}

	/* (non-Javadoc)
	 * @see com.derivit.solutions.bss.um.integration.mediator.IUserQueryMediator#findUserByUsername(java.lang.String)
	 */
	@Override
	public UserDO findUserByUsername(String username) throws MediatorException {
		try {
			UserEntity userEntity = this.userService.findUserByUsername(username);
			return this.objectConverter.convertUserEntityToUserDO(userEntity);
		} catch (DatabaseException e) {
			throw ExceptionHelper.getTransactionFromException(e);
		}
	}

	/* (non-Javadoc)
	 * @see com.derivit.solutions.bss.um.integration.mediator.IUserQueryMediator#findUserByUsernameAndPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public UserDO findUserByUsernameAndPassword(String username, String password) throws MediatorException {
		try {
			UserEntity userEntity = this.userService.findUserByUsernameAndPassword(username, password);
			return this.objectConverter.convertUserEntityToUserDO(userEntity);
		} catch (DatabaseException e) {
			throw ExceptionHelper.getTransactionFromException(e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.derivit.solutions.bss.um.integration.mediator.IUserQueryMediator#findUsersToBeAuthorized(java.lang.String)
	 */
	@Override
	public List<UserDO> findUsersToBeAuthorized(String loggedInUsername) throws MediatorException {
		try {
			List<UserEntity> userEntities = this.userService.findUsersToBeAuthorized(loggedInUsername);
			return this.objectConverter.convertUserEntitiesToUserDOs(userEntities);
		} catch (DatabaseException e) {
			throw ExceptionHelper.getTransactionFromException(e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.derivit.solutions.bss.um.integration.mediator.IUserQueryMediator#saveUser(com.derivit.solutions.bss.um.dataobject.UserDO)
	 */
	@Override
	public UserDO saveUser(UserDO userDOToBeSaved) throws MediatorException {
		try {
			UserEntity userEntity = this.userService.saveUser(this.objectConverter.convertUserDOToUserEntity(userDOToBeSaved));
			return this.objectConverter.convertUserEntityToUserDO(userEntity);
		} catch (DatabaseException e) {
			throw ExceptionHelper.getTransactionFromException(e);
		}
	}
}