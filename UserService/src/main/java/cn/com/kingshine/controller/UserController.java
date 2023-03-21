package cn.com.kingshine.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangfx
 * @date 2023/3/21
 */
public interface UserController {
	
	@GetMapping("/getUser")
	Object getUser() throws Exception;
}
