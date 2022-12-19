package com.app.Entity;

import java.sql.Blob;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GeneratorType;

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
@Table(name = "post")
public class Post {

	@Column(name = "post_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_Id")
//	private Users user;
	
	@Column
	private String description;
	@Column
	private Blob content; // video or image
	@Column
	private int likes;
	@Column
	private int comments;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "post_time", insertable = false)
	private Date postTime;

	@PrePersist
	private void prePersist() {
		if (this.postTime == null) {
			postTime = new Date();
		}
	}
}
