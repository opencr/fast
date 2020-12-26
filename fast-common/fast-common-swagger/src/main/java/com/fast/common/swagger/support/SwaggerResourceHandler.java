package com.fast.common.swagger.support;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.function.server.HandlerFunction;

/**
 * SwaggerResourceHandler
 * @author 刘恒活
 * @since 2020/12/24 9:24
 */

@Slf4j
@Component
@AllArgsConstructor
public class SwaggerResourceHandler implements HandlerFunction<ServerResponse> {

    private final SwaggerResourcesProvider swaggerResources;

    /**
     * Handle the given request.
     * @param request the request to handler
     * @return the response
     */
    @Override
    public Mono<ServerResponse> handle(ServerRequest request) {
        return ServerResponse.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(swaggerResources.get()));
    }

}
