package com.fast.test.annotation;

import com.fast.test.WithMockSecurityContextFactory;
import org.springframework.security.test.context.support.WithSecurityContext;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * WithMockOAuth2User 注解
 * @author 刘恒活
 * @since 2020/12/24 14:39
 */
@Retention(RetentionPolicy.RUNTIME)
@WithSecurityContext(factory = WithMockSecurityContextFactory.class)
public @interface WithMockOAuth2User {
    /**
     * 用户名
     */
    String username() default "admin";

    /**
     * 密码
     */
    String password() default "123456";
}
