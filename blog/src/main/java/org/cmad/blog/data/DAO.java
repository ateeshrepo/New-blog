package org.cmad.blog.data;

import org.cmad.blog.Comment;
import org.cmad.blog.PersonalInfo;
import org.cmad.blog.UserPosts;
import org.cmad.blog.User;

public interface DAO {
	
User createUser(User user);

User getUser(User user);
User updateUser(User user);
	
int createPost(UserPosts post);

UserPosts readPost(int postId);

int postComment(Comment comment);

}
