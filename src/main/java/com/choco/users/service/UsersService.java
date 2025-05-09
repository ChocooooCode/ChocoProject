package com.choco.users.service;

import java.util.List;

import com.choco.pet.model.Pet;
import com.choco.users.model.Users;

public interface UsersService {
	int getUsersCount();
	String getUsersName(String usersId);
	
	void insertUsersAndPet(Users users, Pet pet);
	void reviseUsersAndPet(Users users, Pet pet);
	void deleteUsersAndPet(String usersId);
	
	List<String> getAllUsersIds();
	
	String IdCheck(String usersId);
	String NicknameCheck(String usersNickname);
	String EmailCheck(String usersEmail);
	
	Users loginUsers(String usersId, String usersPwd);
	String findId(String usersName, String usersNickname, String usersBirthdate);
	String findPwd(String usersId, String usersName, String usersBirthdate);
	
	Users getUsersInfo(String usersId);
	String getUsersId(String usersId);
	
	
}