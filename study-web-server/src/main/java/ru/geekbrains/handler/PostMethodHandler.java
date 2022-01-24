package ru.geekbrains.handler;

import ru.geekbrains.config.Config;
import ru.geekbrains.httpObjects.HttpRequest;
import ru.geekbrains.httpObjects.HttpResponse;
import ru.geekbrains.service.ResponseSerializer;

@Handler(methodName = "POST")
public class PostMethodHandler extends MethodHandler {

    protected PostMethodHandler(String method, MethodHandler next, ResponseSerializer responseSerializer, Config config) {
        super(method, next, responseSerializer, config);
    }

    @Override
    protected HttpResponse handleInternal(HttpRequest request) {
        return httpResponseBuilder.withStatus(200)
                .withBody("<h1>Post method!</h1>")
                .build();
    }
}