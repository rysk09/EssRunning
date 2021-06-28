package model;

import dao.UserDAO;

public class AccessUser {
	public User getUser(String userId) {
		UserDAO dao = new UserDAO();
		User user = dao.findByUserId(userId);
		return user;
	}
	public void postUser(User user) {
		UserDAO dao = new UserDAO();
		dao.create(user);
	}
}
