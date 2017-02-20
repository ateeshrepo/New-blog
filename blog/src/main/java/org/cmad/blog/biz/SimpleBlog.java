package org.cmad.blog.biz;

import java.util.List;

import org.cmad.blog.Blog;
import org.cmad.blog.BlogException;
import org.cmad.blog.Comment;
import org.cmad.blog.PersonalInfo;
import org.cmad.blog.UserPosts;
import org.cmad.blog.PostNotFoundException;
import org.cmad.blog.Topic;
import org.cmad.blog.User;
import org.cmad.blog.data.BlogDAO;
import org.cmad.blog.data.DAO;
import org.cmad.blog.data.TestDao;

public class SimpleBlog implements Blog {

	DAO blogDao ;
	
	TestDao dao;
	
	public SimpleBlog() {
		blogDao = new BlogDAO();
		//dao = new TestDao();

	}

	public User addUser(User user) throws BlogException {
		if(user==null || user.getEmail().trim().length() == 0)
		throw new BlogException();
		User result = blogDao.createUser(user);
		return  result;
		
	}

	public User getUser(User user) {
		if(user==null ||user.getEmail().trim().length()==0)
			throw new BlogException();
		User result = blogDao.getUser(user);
		return result;
	}
	
	public List<UserPosts> addPost(UserPosts post) throws BlogException {
		User user = getUser(post.getUser());
		     user.getUserposts().add(post);
		     blogDao.createPost(post);
		     updateUser(user);
		return (List<UserPosts>)user.getUserposts();
	}

	public Comment addComment(Comment comment) throws BlogException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserPosts> getPosts(User user) throws BlogException {
		return null;
	}

	public List<UserPosts> getPosts(Topic topic) throws BlogException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserPosts getPost(int postId) throws PostNotFoundException, BlogException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) throws BlogException {
		User usr = blogDao.updateUser(user);
		return usr;
	}

	

}
