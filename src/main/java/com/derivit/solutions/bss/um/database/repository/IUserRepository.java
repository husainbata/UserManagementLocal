package com.derivit.solutions.bss.um.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.derivit.solutions.bss.um.database.entity.UserEntity;

/**
 * The Interface IUserRepository.
 * 
 * @author prabhat.jha
 */
public interface IUserRepository extends JpaRepository<UserEntity, Long> {

	/**
	 * Find user by id.
	 *
	 * @param id
	 *            the id
	 * @return the user entity
	 */
	public UserEntity findUserById(Long id);

	/**
	 * Find user by username.
	 *
	 * @param username
	 *            the username
	 * @return the user entity
	 */
	public UserEntity findUserByUsername(String username);

	/**
	 * Find user by username and password.
	 *
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 * @return the user entity
	 */
	public UserEntity findUserByUsernameAndPassword(String username, String password);
	
	/**
	 * Find users to be authorized.
	 *
	 * @param loggedInUsername the logged in username
	 * @return the list
	 */
	@Query(value="Select Ue From UserEntity Ue Where Ue.recordStatus = 'M' And Ue.authorizerId <> ?1")
	public List<UserEntity> findUsersToBeAuthorized(String loggedInUsername);
}
