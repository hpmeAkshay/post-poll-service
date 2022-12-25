package com.app.DTO;

import java.util.Date;
import lombok.AllArgsConstructor; 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PollDTO {
	
	private int userId;
	private String question;
//	private List<Option> options;
	private Date createdOn;


}
