package com.yahaha.cloud.auth.controller;

import com.yahaha.cloud.auth.vo.LoginVO;
import com.yahaha.cloud.core.object.CommonResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {
	@RequestMapping(value = "/session", method = RequestMethod.POST)
	public CommonResponse<String> login(@RequestBody LoginVO vo) {
		return null;
	}

	@RequestMapping(value = "/publicKey", method = RequestMethod.GET)
	public CommonResponse<String> getLoginPublicKey(String sessionId) {
		return null;
	}

	@RequestMapping(value = "/sessionId", method = RequestMethod.GET)
	public CommonResponse<String> getSessionId() {
		return null;
	}
}
