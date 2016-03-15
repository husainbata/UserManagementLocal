package com.derivit.solutions.bss.um.database.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.derivit.solutions.bss.um.database.entity.UserEntity;
import com.derivit.solutions.bss.um.database.exception.DatabaseException;
import com.derivit.solutions.bss.um.database.exception.helper.ExceptionHelper;
import com.derivit.solutions.bss.um.database.repository.IUserRepository;
import com.derivit.solutions.bss.um.database.service.IUserService;

/**
 * The Class UserServiceImpl.
 * 
 * @author prabhat.jha
 */
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements IUserService {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -861200950859500060L;

	/** The user repository. */
	@Autowired
	private IUserRepository		userRepository		= null;

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.solutions.bss.um.database.service.IUserService#findUserById(
	 * java.lang.Long)
	 */
	@Override
	public UserEntity findUserById(Long id) throws DatabaseException {
		try {
			return this.userRepository.findUserById(id);
		} catch (Exception e) {
			throw ExceptionHelper.getDatabaseExceptionFromException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.derivit.solutions.bss.um.database.service.IUserService#
	 * findUserByUsername(java.lang.String)
	 */
	@Override
	public UserEntity findUserByUsername(String username) throws DatabaseException {
		try {
			return this.userRepository.findUserByUsername(username);
		} catch (Exception e) {
			throw ExceptionHelper.getDatabaseExceptionFromException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.derivit.solutions.bss.um.database.service.IUserService#
	 * findUserByUsernameAndPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public UserEntity findUserByUsernameAndPassword(String username, String password) throws DatabaseException {
		try {
			return this.userRepository.findUserByUsernameAndPassword(username, password);
		} catch (Exception e) {
			throw ExceptionHelper.getDatabaseExceptionFromException(e);
		}
	}

	/* (non-Javadoc)
	 * @see com.derivit.solutions.bss.um.database.service.IUserService#findUsersToBeAuthorized(java.lang.String)
	 */
	@Override
	public List<UserEntity> findUsersToBeAuthorized(String loggedInUsername) throws DatabaseException {
		try {
			return this.userRepository.findUsersToBeAuthorized(loggedInUsername);
		} catch (Exception e) {
			throw ExceptionHelper.getDatabaseExceptionFromException(e);
		}
	}
	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.solutions.bss.um.database.service.IUserService#saveUser(com.
	 * derivit.solutions.bss.um.database.entity.UserEntity)
	 */
	@Override
	public UserEntity saveUser(UserEntity userToBeSaved) throws DatabaseException {
		try {
			return this.userRepository.save(userToBeSaved);
		} catch (Exception e) {
			throw ExceptionHelper.getDatabaseExceptionFromException(e);
		}
	}
}