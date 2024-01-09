package com.maocq.reactive.infrastructure.entrypoints.reactiveweb;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class Handler {

    public Mono<ServerResponse> hello(ServerRequest serverRequest) {
        return ServerResponse.ok().bodyValue("Hello world!");
    }
}
