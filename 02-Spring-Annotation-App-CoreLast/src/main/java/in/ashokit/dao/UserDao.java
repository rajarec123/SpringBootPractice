package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("UserDao:: Constructor...!");
	}
	public boolean save() {
		System.out.println("User Saved in DB...!");
		return true;
	}
}
