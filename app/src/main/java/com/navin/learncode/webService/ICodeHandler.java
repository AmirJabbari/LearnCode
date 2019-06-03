package com.navin.learncode.webService;

import com.navin.learncode.model.AlbumModel;
import com.navin.learncode.model.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ICodeHandler {



    @GET("api.php?latest")
    public Call<List<PostModel>> getLatest();

    @GET("api.php")
    public Call<List<AlbumModel>> getAlbums(@Query("album_id") String id);

    @GET("api.php")
    public Call<List<PostModel>> getPostByCat(@Query("cat_id") String id);

}
