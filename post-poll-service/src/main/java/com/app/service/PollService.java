package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DTO.PollDTO;
import com.app.Entity.Poll;
import com.app.Repository.PollRepository;

@Service
public class PollService {

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private PollRepository pollRepo;
	
	public Poll createPoll(PollDTO pollDto) {
		Poll pollAdd=mapper.map(pollDto, Poll.class);
		System.out.println(pollAdd);
		pollRepo.save(pollAdd);
		return pollAdd;
	}

	public int deletePoll(int pollId) {
		pollRepo.deleteById(pollId);
		return 1;
	}

	public List<Poll> getAllPolls() {
		return pollRepo.findAll();
	}

	

}
