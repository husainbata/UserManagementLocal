package com.derivit.solutions.bss.um.integration.mediator;

import java.util.List;

import com.derivit.solutions.bss.um.dataobject.UserDO;
import com.derivit.solutions.bss.um.integration.mediator.exception.MediatorException;

/**
 * The Interface IUserQueryMediator.
 * 
 * @author prabhat.jha
 */
public interface IUserQueryMediator {

	/**
	 * Find user by id.
	 *
	 * @param id the id
	 * @return the user do
	 * @throws MediatorException             the mediator exception
	 */
	public UserDO findUserById(Long id) throws MediatorException;

	/**
	 * Find user by username.
	 *
	 * @param username the username
	 * @return the user do
	 * @throws MediatorException             the mediator exception
	 */
	public UserDO findUserByUsername(String username) throws MediatorException;

	/**
	 * Find user.
	 *
	 * @param username the username
	 * @param password            the password
	 * @return the user do
	 * @throws MediatorException             the mediator exception
	 */
	public UserDO findUserByUsernameAndPassword(String username, String password) throws MediatorException;

	/**
	 * Find users to be authorized.
	 *
	 * @param loggedInUsername the logged in username
	 * @return the list
	 * @throws MediatorException the mediator exception
	 */
	public List<UserDO> findUsersToBeAuthorized(String loggedInUsername) throws MediatorException;

	/**
	 * Save user.
	 *
	 * @param userDOToBeSaved the user do to be saved
	 * @return the user do
	 * @throws MediatorException the mediator exception
	 */
	public UserDO saveUser(UserDO userDOToBeSaved) throws MediatorException;
}