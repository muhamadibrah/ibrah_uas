package com.gusri.appmovie.data.api

import com.gusri.appmovie.data.model.ListResponse
import com.gusri.appmovie.data.model.MovieResponse
import com.gusri.appmovie.data.model.TvShowResponse
import com.gusri.appmovie.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}