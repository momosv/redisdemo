package cn.momosv.redisdemo;

import cn.momosv.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@EnableCaching //开启缓存
@RestController
@RequestMapping("redis")
public class RedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisDemoApplication.class, args);
	}


		@Autowired
		UserService userService;

		@RequestMapping("/addUser")
		public String add(){
			String uu = UUID.randomUUID().toString();
			userService.set(uu);
			return uu;
		}
		@RequestMapping("/getUser")
		public String get(String uu){
			return  userService.get(uu);
		}

}
