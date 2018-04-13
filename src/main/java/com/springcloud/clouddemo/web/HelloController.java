package com.springcloud.clouddemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class HelloController {
	
    @ApiOperation(value="返回hello world", notes="服务提供方")
    @ApiImplicitParam(name = "null", value = "null", required = false, dataType = "null")
	@RequestMapping("/hello")
	public String index() {
		return "Hello world";
	}
}
