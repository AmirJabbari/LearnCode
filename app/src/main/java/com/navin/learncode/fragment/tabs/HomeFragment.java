package com.navin.learncode.fragment.tabs;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.navin.learncode.R;
import com.navin.learncode.adapter.PostAdapter;
import com.navin.learncode.model.IMessageListner;
import com.navin.learncode.model.PostModel;
import com.navin.learncode.webService.WebServiceCaller;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    WebServiceCaller webServiceCaller;
    public HomeFragment() {
        // Required empty public constructor
    }
    @BindView(R.id.recycler)
    RecyclerView recyclerView;
    @BindView(R.id.progress)
    ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this,view);
       webServiceCaller=new WebServiceCaller(getActivity());
        getLatest();
        progressBar.setVisibility(View.VISIBLE);
        return view;
    }


    public void getLatest(){

        try {
            webServiceCaller.getLatest(new IMessageListner() {
                @Override
                public void onSuccess(List<PostModel> response) {
                    PostAdapter postAdapter=new PostAdapter(getActivity(),response);
                    recyclerView.setAdapter(postAdapter);
                    recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
                    progressBar.setVisibility(View.GONE);

                }

                @Override
                public void onError(String errorResponse) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
