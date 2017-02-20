package org.cmad.blog.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.cmad.blog.Blog;
import org.cmad.blog.PersonalInfo;
import org.cmad.blog.User;
import org.cmad.blog.UserPosts;
import org.cmad.blog.biz.SimpleBlog;

@Path("/user")
public class BlogController {
	Blog blog;

	public BlogController() {

		blog = new SimpleBlog();
		
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/signup")
	public Response add(User user) {


		User us = blog.addUser(user);
		return Response.ok().entity(us).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/signin")
	public Response signIn(User user) {
		User usr = blog.getUser(user);
		return Response.ok().entity(usr).build();

	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addPost")
	public Response addPost(UserPosts post) {
		List<UserPosts> postList = blog.addPost(post);
		return Response.ok().entity(postList).build();
		

	}

}
