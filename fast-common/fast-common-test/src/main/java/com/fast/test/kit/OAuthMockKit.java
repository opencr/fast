package com.fast.test.kit;

import com.fast.common.core.util.SpringContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.test.web.servlet.request.RequestPostProcessor;

/**
 * Mock 工具类
 * @author 刘恒活
 * @since 2020/12/24 14:39
 */
public class OAuthMockKit {

    /**
     * mock 请求增加统一请求头
     * @return RequestPostProcessor 类似于拦截器
     */
    public static RequestPostProcessor token() {
        return mockRequest -> {
            OAuth2ClientContext clientContext = SpringContextHolder.getBean(OAuth2ClientContext.class);
            String token = clientContext.getAccessToken().getValue();
            mockRequest.addHeader(HttpHeaders.AUTHORIZATION, String.format("Bearer: %s", token));
            return mockRequest;
        };
    }

}
