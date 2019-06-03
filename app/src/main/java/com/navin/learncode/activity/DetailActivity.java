package com.navin.learncode.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.navin.learncode.MainActivity;
import com.navin.learncode.R;
import com.navin.learncode.adapter.PostAdapter;
import com.navin.learncode.model.IMessageListner;
import com.navin.learncode.model.PostModel;
import com.navin.learncode.webService.WebServiceCaller;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {
    Bundle bundle;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.img)
    AppCompatImageView imageView;
    @BindView(R.id.txtData)
            AppCompatTextView textView;
    @BindView(R.id.txtDataa)
    AppCompatTextView textViewData;
    @BindView(R.id.progress)
    ProgressBar progressBar;
    @BindView(R.id.refresh)
    SwipeRefreshLayout refreshLayout;
    @BindView(R.id.rel1)
    RelativeLayout relativeLayout;
    String id;
    PostAdapter postAdapter;
    WebServiceCaller webServiceCaller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        bundle=getIntent().getExtras();
        id=bundle.getString("id");

        textView.setVisibility(View.GONE);

        webServiceCaller=new WebServiceCaller(getApplicationContext());
        getPostByCat();
        progressBar.setVisibility(View.VISIBLE);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getPostByCat();
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(refreshLayout.isRefreshing()) {
                            refreshLayout.setRefreshing(false);
                        }
                    }
                }, 1000);
            }
        });

    }
    public void getPostByCat(){

        try {
            webServiceCaller.getPostByCat(new IMessageListner() {
                @Override
                public void onSuccess(List<PostModel> response) {
                    postAdapter=new PostAdapter(getApplicationContext(),response);
                    recyclerView.setAdapter(postAdapter);
                    recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
                    textView.setVisibility(View.GONE);
                    progressBar.setVisibility(View.GONE);
                    recyclerView.setVisibility(View.VISIBLE);
                }

                @Override
                public void onError(String errorResponse) {
                    progressBar.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.GONE);
                    recyclerView.setVisibility(View.GONE);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setVisibility(View.GONE);
                            textView.setVisibility(View.VISIBLE);
                        }
                    },2000);


                }
            },id);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
