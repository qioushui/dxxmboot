package com.dx.common.controller;

import org.springframework.stereotype.Controller;
import com.dx.common.utils.ShiroUtils;
import com.dx.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}