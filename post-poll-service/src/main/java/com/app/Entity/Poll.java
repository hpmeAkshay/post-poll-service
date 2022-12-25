package com.app.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.app.submodule.common.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "poll")
public class Poll {
	
	@Column(name = "poll_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pollId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private Users user;
	
	@Column
	private String question;
	
//	@OneToMany(mappedBy = "pollId")
//	private List<Option> options;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on",insertable = false)
	private Date createdOn;

	@PrePersist 
	private void prePersist() {
		if(this.createdOn==null) {
			createdOn = new Date();
		}
	}
}
