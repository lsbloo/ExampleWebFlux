package com.example.reativeflux.api.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
public class Movie {

    @SerializedName("adult")
    private Boolean adult;
    @SerializedName("backdrop_path")
    private String backdrop_path;
    @SerializedName("genreIds")
    private List<Integer> genreIds;
    @SerializedName("id")
    private Integer id;
    @SerializedName("originalLanguage")
    private String originalLanguage;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("overview")
    private String overview;
    @SerializedName("popularity")
    private String popularity;
    @SerializedName("poster_path")
    private String poster_path;
    @SerializedName("release_date")
    private String release_date;
    @SerializedName("title")
    private String title;
    @SerializedName("video")
    private Boolean video;
    @SerializedName("vote_average")
    private Double voteAverage;
    @SerializedName("voteCount")
    private int voteCount;

}
