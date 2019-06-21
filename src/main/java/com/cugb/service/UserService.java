package com.cugb.service;

import java.util.List;

import com.cugb.pojo.User;

public interface UserService {
	public void addUser(User user);

	public User getUserByPhone(String phone);

	public User getUserByEmail(String email);

	public void updateUserName(User user);

	int updateGoodsNum(Integer id, Integer goodsNum);

	User selectByPrimaryKey(Integer id);

	public List<User> getPageUser(int pageNum, int pageSize);

	public int getUserNum();

	public int getUserNum(String username);

	public List<User> getPageUser(int pageNum, int pageSize, String username);

	public User getUserById(int id);

	public void deleteUserById(String idArr);

	public List<User> getPageUserByUser(String email, String username, String phone, int pageNum, int pageSize);

	public List<User> getUserOrderByDate(int size);

}