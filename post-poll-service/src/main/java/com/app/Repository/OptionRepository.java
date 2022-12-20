package com.app.Repository;

import org.aspectj.weaver.loadtime.Options;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Options, Integer>{
	
	int voteForOption(int optionId);
	

}
