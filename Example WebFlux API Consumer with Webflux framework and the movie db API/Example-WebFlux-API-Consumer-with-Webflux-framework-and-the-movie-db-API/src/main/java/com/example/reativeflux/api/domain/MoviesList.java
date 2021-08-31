package com.example.reativeflux.api.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class MoviesList {

    @SerializedName("results")
    public List<Movie> movieList;

    public String getItemCount(){
        return "Quantidade de filmes encontrados: " + this.movieList.size();
    }
}
