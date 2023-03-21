package cn.com.kingshine.net;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangfx
 * @date 2023/3/21
 *  = @FeignClient(name = "service2", path = "")
 *  *  name: 注册中心里的服务名
 *  *  path: 指定服务下的controller上RequestMapping指定的路径
 */
@FeignClient(name = "seismic-service", path = "")
public interface SeismicService {
	
	@GetMapping("/getProject")
	Object getProject() throws Exception;
}
