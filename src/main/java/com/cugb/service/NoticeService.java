package com.cugb.service;

import java.util.List;

import com.cugb.pojo.Notice;
import com.cugb.pojo.NoticeExtend;

public interface NoticeService {

	List<Notice> getNoticeList();
	
	public void insertSelective(Notice notice);
	
	



}
