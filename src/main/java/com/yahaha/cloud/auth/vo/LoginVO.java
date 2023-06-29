package com.yahaha.cloud.auth.vo;

import java.io.Serial;
import java.io.Serializable;

public class LoginVO implements Serializable {
	@Serial
	private static final long serialVersionUID = 9183835631990381186L;

	private String account;

	private String password;

	private String sessionId;
}
