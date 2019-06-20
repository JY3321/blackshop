package com.cugb.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.cugb.dao.NoticeMapper;
import com.cugb.pojo.Notice;
import com.cugb.pojo.NoticeExtend;
import com.cugb.service.NoticeService;

@Service("NoticeService")
public class NoticeServiceImpl implements NoticeService{
	 @Resource
	 private NoticeMapper noticeMapper;

	@Override
	public List<Notice> getNoticeList() {
		
		return noticeMapper.getNoticeList();
	}

	@Override
	public void insertSelective(Notice notice) {
		noticeMapper.insertSelective(notice);
		
	}




}
