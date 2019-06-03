package com.navin.learncode.model;

import java.util.List;

public interface IMessageAlbum {



        public void onSuccess(List<AlbumModel> albumList);
        public void onError(String errorResponse);


}
