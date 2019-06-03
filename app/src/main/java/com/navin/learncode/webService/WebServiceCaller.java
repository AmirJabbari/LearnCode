package com.navin.learncode.webService;

import android.content.Context;
import android.util.Log;

import com.navin.learncode.model.AlbumModel;
import com.navin.learncode.model.IMessageAlbum;
import com.navin.learncode.model.IMessageListner;
import com.navin.learncode.model.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WebServiceCaller {


    Context context;
    ICodeHandler apiInterface;
    PostModel postModel=new PostModel();

    public WebServiceCaller(Context context){
        this.context=context;
        apiInterface=ApiClinet.getClinet().create(ICodeHandler.class);

    }

    public void getLatest(IMessageListner iMessageListner) throws Exception{

        Call<List<PostModel>> getLatest=apiInterface.getLatest();
        getLatest.enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                iMessageListner.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {
                iMessageListner.onError(t.getMessage());
            }
        });
    }
    public void getAlbums(IMessageAlbum iMessageAlbum, String id) throws Exception{

        Call<List<AlbumModel>> getAlbums=apiInterface.getAlbums(id);
        getAlbums.enqueue(new Callback<List<AlbumModel>>() {
            @Override
            public void onResponse(Call<List<AlbumModel>> call, Response<List<AlbumModel>> response) {
                iMessageAlbum.onSuccess(response.body());
                Log.e("","");

            }

            @Override
            public void onFailure(Call<List<AlbumModel>> call, Throwable t) {
                iMessageAlbum.onError(t.getMessage());
                Log.e("","");

            }
        });

    }
public void getPostByCat(IMessageListner iMessageListner,String id) throws Exception{
        Call<List<PostModel>> getPostByCat=apiInterface.getPostByCat(id);
        getPostByCat.enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                iMessageListner.onSuccess(response.body());

            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {
                iMessageListner.onError(t.getMessage());

            }
        });



}



}
