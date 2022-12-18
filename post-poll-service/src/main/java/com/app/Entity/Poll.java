package com.app.Entity;

import java.sql.Blob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String description;

	@Column
	private Blob image;

	@Column(name = "post_time", insertable = false)
	private LocalDate postTime;
}
