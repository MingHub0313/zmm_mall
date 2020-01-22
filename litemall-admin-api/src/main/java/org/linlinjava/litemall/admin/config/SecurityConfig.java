package org.linlinjava.litemall.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring Security 配置类.
 * @Name SecurityConfig
 * @Author 900045
 * @Created by 2020/1/21 0021
 */
@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
public class SecurityConfig  extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// 允许跨域请求
		registry.addMapping("/**").allowedOrigins("*") ;
	}
}
