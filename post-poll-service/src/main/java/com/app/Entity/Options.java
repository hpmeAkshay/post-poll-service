package com.app.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "options")
public class Options {

	@Column(name = "option_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int optionId;
	
	@ManyToOne
	@JoinColumn(name = "poll_id")
	private Poll pollId;
	 
	@Column
	private String option1;
	
	@Column
	private String option2;
	
	@Column
	private String option3;
	
	@Column
	private String option4;
	
}
