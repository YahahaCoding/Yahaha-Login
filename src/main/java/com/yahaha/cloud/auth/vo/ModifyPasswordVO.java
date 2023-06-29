package com.yahaha.cloud.auth.vo;

import java.io.Serial;
import java.io.Serializable;

public class ModifyPasswordVO implements Serializable {
	@Serial
	private static final long serialVersionUID = -1526014640393881352L;

	private String account;

	private String oldPassword;

	private String newPassword;

	private String sessionId;

	public String getAccount() {
		return account;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public String getSessionId() {
		return sessionId;
	}
}
