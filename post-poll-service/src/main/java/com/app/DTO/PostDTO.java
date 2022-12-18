package com.app.DTO;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class PostDTO {

	private int postId;
//	private Users user;
	@NotBlank(message = "Description is Required")
	private String description;
	@NotBlank(message = "Image is Required")
	private Blob image;
	private int likes;
	private int comments;
	@Temporal(TemporalType.TIMESTAMP)
	private Date postTime;

	public PostDTO(int postId, @NotBlank(message = "Description is Required") String description,
			@NotBlank(message = "Image is Required") Blob image, int likes, int comments, Date postTime) {
		super();
		this.postId = postId;
		this.description = description;
		this.image = image;
		this.likes = likes;
		this.comments = comments;
		this.postTime = postTime;
	}

}
