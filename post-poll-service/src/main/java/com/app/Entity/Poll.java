package com.app.Entity;

import java.sql.Blob;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * @JoinColumn("user_Id") 
	 * private Users user;
	 */
	@Column
	private String question;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdOn;

	@PrePersist
	private void prePersist() {
		if(this.createdOn==null) {
			createdOn = new Date();
		}
	}
}
