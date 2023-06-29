package com.yahaha.cloud.auth.bo;

import com.yahaha.cloud.auth.po.User;

import java.io.Serial;
import java.io.Serializable;

public class UserBO implements Serializable {
	@Serial
	private static final long serialVersionUID = 3235231304708954654L;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
