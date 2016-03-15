package com.derivit.solutions.bss.um.database.service;

import java.io.Serializable;
import java.util.List;

import com.derivit.solutions.bss.um.database.entity.UserEntity;
import com.derivit.solutions.bss.um.database.exception.DatabaseException;

/**
 * The Interface IUserService.
 * @author prabhat.jha
 */
public interface IUserService extends Serializable {

	/**
	 * Find user by id.
	 *
	 * @param id the id
	 * @return the user entity
	 * @throws DatabaseException the database exception
	 */
	public UserEntity findUserById(Long id) throws DatabaseException;

	/**
	 * Find user by username.
	 *
	 * @param username the username
	 * @return the user entity
	 * @throws DatabaseException the database exception
	 */
	public UserEntity findUserByUsername(String username) throws DatabaseException;

	/**
	 * Find user by username and password.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the user entity
	 * @throws DatabaseException the database exception
	 */
	public UserEntity findUserByUsernameAndPassword(String username, String password) throws DatabaseException;

	/**
	 * Find users to be authorized.
	 *
	 * @param loggedInUsername the logged in username
	 * @return the list
	 * @throws DatabaseException the database exception
	 */
	public List<UserEntity> findUsersToBeAuthorized(String loggedInUsername) throws DatabaseException;

	/**
	 * Save user.
	 *
	 * @param userToBeSaved the user to be saved
	 * @return the user entity
	 * @throws DatabaseException the database exception
	 */
	public UserEntity saveUser(UserEntity userToBeSaved) throws DatabaseException;
}