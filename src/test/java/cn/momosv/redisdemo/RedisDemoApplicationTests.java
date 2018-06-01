package cn.momosv.redisdemo;

import cn.momosv.redisdemo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.Key;
import java.time.Duration;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableCaching // 启动缓存
@ConfigurationProperties(
		prefix = "momo"
)
public class RedisDemoApplicationTests {
	private String aa = "aaa";
	private String bb = "aaas";

	public String getBb() {
		return bb;
	}

	public void setBb(String bb) {
		this.bb = bb;
	}

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}


		@Autowired
		private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private UserService userService;
	@Autowired
	private RedisTemplate redisTemplate;


		@Test
		public void save() {
			userService.set("sss");
		    String s = (String) userService.get("ss");
			System.out.println(s);
		}


	}
