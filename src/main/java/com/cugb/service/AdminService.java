package com.cugb.service;

import com.cugb.pojo.Admin;

public interface AdminService {

	
	public Admin findAdmin(Long phone, String password);

	public Admin findAdminById(Integer id);

	public void updateAdmin(Admin admins);
	
	

}
