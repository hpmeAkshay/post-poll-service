package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Poll;
@Repository
public interface PollRepository extends JpaRepository<Poll, Integer>{

}
