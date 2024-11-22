package com.choco.attach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.choco.attach.dao.AttachRepository;
import com.choco.attach.model.Attach;

public class BasicAttachService implements AttachService {

	@Autowired
	AttachRepository attachRepository;

	@Override
	public List<Attach> getAttachList(int boardId) {
		return attachRepository.getAttachList(boardId);
	}

	@Override
	public void insertAttach(Attach attach) {
		attachRepository.insertAttach(attach);
	}

	@Override
	public void deleteAttach(int boardId) {
		attachRepository.deleteAttach(boardId);
	}

}