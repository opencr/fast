package com.fast.common.sentinel.parser;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 刘恒活
 * @since 2020/12/24 14:12
 */
public class FastHeaderRequestOriginParser implements RequestOriginParser {

    /**
     * 请求头获取allow
     */
    private static final String ALLOW = "Allow";

    /**
     * Parse the origin from given HTTP request.
     * @param request HTTP request
     * @return parsed origin
     */
    @Override
    public String parseOrigin(HttpServletRequest request) {
        return request.getHeader(ALLOW);
    }

}
