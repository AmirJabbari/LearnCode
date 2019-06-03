package com.navin.learncode.fragment.tabs;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.navin.learncode.R;
import com.navin.learncode.adapter.AlbumAdapter;
import com.navin.learncode.adapter.MainAdapter;
import com.navin.learncode.model.AlbumModel;
import com.navin.learncode.model.CategoryModel;
import com.navin.learncode.model.IMessageAlbum;
import com.navin.learncode.utils.WebCategory;
import com.navin.learncode.webService.WebServiceCaller;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class WebDevelopmentFragment extends Fragment {
    private View view;

    WebServiceCaller webServiceCaller;

    // private View view;

    public WebDevelopmentFragment() {
        // Required empty public constructor
    }
    @BindView(R.id.recycler)
    RecyclerView recyclerView;
    @BindView(R.id.recycler_album)
    RecyclerView recycler_album;
    @BindView(R.id.progress)
    ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_web_development, container, false);
        ButterKnife.bind(this,view);
        WebCategory webCategory=new WebCategory();
       List<CategoryModel> response = webCategory.getAllWebCategory();
        MainAdapter mainAdapter =new MainAdapter(getActivity(), response);
        recyclerView.setAdapter(mainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,
                false));
        webServiceCaller=new WebServiceCaller(getActivity());
        getAlbums();
        progressBar.setVisibility(View.VISIBLE);
        return view;

    }
    public void getAlbums(){
        try {
            webServiceCaller.getAlbums(new IMessageAlbum() {
                @Override
                public void onSuccess(List<AlbumModel> response) {
                    AlbumAdapter albumAdapter=new AlbumAdapter(getActivity(),response);
                    recycler_album.setAdapter(albumAdapter);
                    recycler_album.setLayoutManager(new GridLayoutManager(getActivity(),2));
                    Log.e("","");
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onError(String errorResponse) {
                    Log.e("","");
                progressBar.setVisibility(View.VISIBLE);
                }
            },"1");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
