package org.cmad.blog;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comment {
	@Id @GeneratedValue
	private int id;
	private String comment;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdTime;
	//@OneToOne
	@OneToOne(cascade = CascadeType.ALL)
	private User byUser;
	
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(String comment, User byUser) {
		super();
		this.comment = comment;
		//this.createdTime = System.currentTimeMillis();
		this.byUser = byUser;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public User getByUser() {
		return byUser;
	}
	public void setByUser(User byUser) {
		this.byUser = byUser;
	}
}
