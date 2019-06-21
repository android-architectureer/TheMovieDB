package me.skrilltrax.themoviedb.network.api

import me.skrilltrax.themoviedb.model.MovieResponse
import me.skrilltrax.themoviedb.network.RetrofitInstance
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiInterface {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String) : Response<MovieResponse>

    @GET("movie/latest")
    suspend fun getLatestMovies(@Query("api_key") apiKey: String) : Response<MovieResponse>

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(@Query("api_key") apiKey: String) : Response<MovieResponse>

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(@Query("api_key") apiKey: String) : Response<MovieResponse>

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Query("api_key") apiKey: String) : Response<MovieResponse>

    companion object {
        fun getClient() : MovieApiInterface {
            val retrofit = RetrofitInstance.getInstance()
            return retrofit.create(MovieApiInterface::class.java)
        }
    }
}