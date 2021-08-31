package com.example.reativeflux.api.webclient;


import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import static com.example.reativeflux.api.constants.ConstantsCore.Base.BASE_URL_LOCAL;

@Component
public class MoviesWebClient {

    private final WebClient webClient;

    public MoviesWebClient(WebClient.Builder webClient) {
        this.webClient = webClient.baseUrl(BASE_URL_LOCAL).build();
    }

    public WebClient getWebClient() {
        return webClient;
    }
}
