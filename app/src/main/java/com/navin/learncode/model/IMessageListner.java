package com.navin.learncode.model;

import java.util.List;

public interface IMessageListner {

    public void onSuccess(List<PostModel> postList);
    public void onError(String errorResponse);
}
