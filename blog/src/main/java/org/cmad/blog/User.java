package org.cmad.blog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.xml.bind.annotation.XmlRootElement;

@Entity(name="USER_DETAILS")
@XmlRootElement
public class User {
	
	@Id
	private String email;
	@OneToMany(fetch=FetchType.EAGER)
	private Collection <UserPosts>  userposts = new ArrayList<UserPosts>();
	

	private String password;
	private String name;
	
	
	
	public User() {
		super();
		
	}

	public User(String email, String password,String name ){
		super();
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Collection<UserPosts> getUserposts() {
		return userposts;
	}

	public void setUserposts(Collection<UserPosts> userposts) {
		this.userposts = userposts;
	}

@Override
public String toString() {
	return  getEmail()+" "+getPassword()+" "+getUserposts();
}
	

	
}
