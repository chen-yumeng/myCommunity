package com.cg.community.configuration;

import com.cg.community.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: community->LoginConfiguration
 * @description:
 * @author: cg
 * @create: 2020-03-12 10:23
 **/
@Configuration
public class LoginConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        LoginHandlerInterceptor loginInterceptor = new LoginHandlerInterceptor();
        InterceptorRegistration interceptor = registry.addInterceptor(loginInterceptor);
        //拦截路径
        interceptor.addPathPatterns("/**");
        //排除路径
        interceptor.excludePathPatterns("/");
        interceptor.excludePathPatterns("/login");
        interceptor.excludePathPatterns("/callback");
        interceptor.excludePathPatterns("/user/getUserIsLogin");
        //TODO:开发期间临时登录方式
        interceptor.excludePathPatterns("/user/login");
        // 排除资源请求
        interceptor.excludePathPatterns("/css/**");
        interceptor.excludePathPatterns("/js/**");
        interceptor.excludePathPatterns("/font/**");
    }
}
