package com.sty.ne.materialdesign.net;

import com.sty.ne.materialdesign.bean.Movie;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by tian on 2019/10/19.
 */

public interface MovieService {
    @GET("top250")
    Observable<Movie> getTopMovie(@Query("start") int start, @Query("count") int count);
}
