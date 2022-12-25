package com.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.app.Entity.Voters;

public interface VoterRepository extends JpaRepository<Voters, Integer>{

//	@Query(value = "SELECT * FROM voters WHERE option_id=?1;", nativeQuery = true)
//	List<Voters> findAllByOptionId(Option option);

}
