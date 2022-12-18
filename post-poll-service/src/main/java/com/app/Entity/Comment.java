package com.app.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "comment")
public class Comment {

	@Column(name = "comment_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commentId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_id")
	private Post post;

	/*
	 * @ManyToOne
	 * @JoinColumn(name = "user_Id" ) 
	 * private Users user;
	 */
	@Column(length = 255)
	private String comment;

}
