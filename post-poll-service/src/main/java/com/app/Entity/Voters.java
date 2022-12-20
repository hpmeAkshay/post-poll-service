package com.app.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "voters")
public class Voters {

	@Column(name = "voter_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int voterId;
	
	@ManyToOne
	private Option optionId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on",insertable = false)
	private Date createdOn;
	
	@PrePersist
	private void prepersist() {
		if(this.createdOn==null) createdOn=new Date();
	}
	
	
}
