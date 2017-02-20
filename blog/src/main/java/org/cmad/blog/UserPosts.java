package org.cmad.blog;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class UserPosts {
	@Id @GeneratedValue
	private int id;
	private String title;
	private String body;
	@ManyToOne
	private User user;
	private Date createdTime;
	

	
	
	public UserPosts() {
		
	}

	public UserPosts(String title, String body,User user) {
		super();
		this.title = title;
		this.body = body;
		this.createdTime = new Date();
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return getBody()+"" +getTitle();
}
}
