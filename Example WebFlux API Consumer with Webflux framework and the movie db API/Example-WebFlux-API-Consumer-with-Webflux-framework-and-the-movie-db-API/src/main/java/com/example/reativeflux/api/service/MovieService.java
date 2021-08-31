package com.example.reativeflux.api.service;


import com.example.reativeflux.api.config.RetrofitInitializer;
import com.example.reativeflux.api.constants.ConstantsCore;
import com.example.reativeflux.api.domain.MoviesList;
import com.example.reativeflux.api.webclient.MoviesWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import retrofit2.Retrofit;

import static com.example.reativeflux.api.constants.ConstantsCore.Base.PATH_MOVIES_LOCAL;

@Service
public class MovieService {

    private Retrofit initializerRetrofit;

    @Autowired
    private final MoviesWebClient moviesWebClient;

    public MovieService(MoviesWebClient moviesWebClient){
        this.moviesWebClient = moviesWebClient;
        this.initializerRetrofit = RetrofitInitializer.getRetrofit();
    }

    public Flux<MoviesList> getMoviesPopular(){
         return this.initializerRetrofit.create(com.example.reativeflux.api.config.api.MovieService.class)
        .getMoviesPopular(ConstantsCore.Retrofit.API_KEY);
    }


    public Flux<String> getMoviesPopularWithWebClient(){
        return this.moviesWebClient.getWebClient().get().uri(PATH_MOVIES_LOCAL).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(MoviesList.class)
                .map(MoviesList::getItemCount);
    }
}
