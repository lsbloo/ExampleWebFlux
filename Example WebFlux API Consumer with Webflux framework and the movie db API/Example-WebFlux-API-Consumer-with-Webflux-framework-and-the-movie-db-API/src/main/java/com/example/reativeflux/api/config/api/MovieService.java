package com.example.reativeflux.api.config.api;

import com.example.reativeflux.api.domain.MoviesList;
import reactor.core.publisher.Flux;
import retrofit2.http.GET;
import retrofit2.http.Query;
import static com.example.reativeflux.api.constants.ConstantsCore.PATHS.GET_MOVIE_POPULAR;

public interface MovieService {
    @GET(GET_MOVIE_POPULAR)
    Flux<MoviesList> getMoviesPopular(@Query("api_key") String api_key);
}
