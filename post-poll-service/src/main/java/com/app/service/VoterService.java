package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.Entity.Voters;
import com.app.Repository.VoterRepository;

@Service
public class VoterService {
	@Autowired
	private VoterRepository voterRepo;

//	public List<Voters> getVoters(int optionId) {
//		Option votersOption = new Option();
//		votersOption.setOptionId(optionId);
//		List<Voters> voterList = voterRepo.findAllByOptionId(votersOption);
//		return voterList;
//	}
}
