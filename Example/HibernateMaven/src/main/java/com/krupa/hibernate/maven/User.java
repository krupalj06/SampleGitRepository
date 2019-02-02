package com.krupa.hibernate.maven;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {
	
	@Id
	@Column(name = "user_id")
	private userId;
	
	@column(name = "user_name")
	private userName;
	
	@Column(name = "created_by")
	private string createdBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	

}
