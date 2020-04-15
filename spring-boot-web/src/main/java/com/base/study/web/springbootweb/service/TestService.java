package com.base.study.web.springbootweb.service;

import com.base.study.web.springbootweb.responsity.TestReponsity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 下午1:32 2020/4/15
 * Author: Jonn.Z
 * Version:1.0.
 */
@Component
public class TestService {

	@Autowired
	private TestReponsity testResponsity;


	public Object getData() {
		return this.testResponsity.findAll();
	}

}
