package cn.com.kingshine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangfx
 * @date 2023/3/21
 */
@RequestMapping("/api")
public interface ProcessController {
	
	@GetMapping("/getProject")
	Object getProject() throws Exception;
}
