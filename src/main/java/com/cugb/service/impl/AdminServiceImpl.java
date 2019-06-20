package com.cugb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cugb.dao.AdminMapper;
import com.cugb.pojo.Admin;
import com.cugb.service.AdminService;

@Service(value="adminService")
public class AdminServiceImpl implements AdminService {
	@Resource
	private AdminMapper am;

	@Override
	public Admin findAdmin(Long phone, String password) {
		// TODO Auto-generated method stub
		return am.findAdmin(phone,password);
	}

	@Override
	public Admin findAdminById(Integer id) {
		// TODO Auto-generated method stub
		return am.findAdminById(id);
	}

	@Override
	public void updateAdmin(Admin admins) {
		 am.updateAdmin(admins);
	}


	

}
