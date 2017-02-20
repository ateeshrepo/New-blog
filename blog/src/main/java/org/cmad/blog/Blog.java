package org.cmad.blog;

import java.util.List;

public interface Blog {
	
	public User addUser(User user) throws BlogException;

	public User getUser(User user) throws BlogException;
	
	public User updateUser(User user) throws BlogException;

	public List<UserPosts> addPost(UserPosts post) throws BlogException;

	public Comment addComment(Comment comment) throws BlogException;

	public List<UserPosts> getPosts(User user) throws BlogException;

	public List<UserPosts> getPosts(Topic topic) throws BlogException;

	public UserPosts getPost(int postId) throws PostNotFoundException, BlogException;
}
