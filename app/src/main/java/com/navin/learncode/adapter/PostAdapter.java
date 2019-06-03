package com.navin.learncode.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.navin.learncode.R;
import com.navin.learncode.activity.DescriptionActivity;
import com.navin.learncode.model.PostModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {
    Context context;
    List<PostModel> postModelList=new ArrayList<>();

    public PostAdapter(Context context, List<PostModel> posts) {
        this.context = context;
        this.postModelList = posts;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_posts,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            PostModel postModel=postModelList.get(position);
            holder.textView.setText(postModel.getMp3Title());
            Picasso.get().load(postModel.getMp3ThumbnailB()).into(holder.imageView);
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context, DescriptionActivity.class);
                    intent.putExtra("title",postModel.getMp3Title());
                    intent.putExtra("description",postModel.getMp3Description());
                    context.startActivity(intent);
                }
            });


    }

    @Override
    public int getItemCount() {
        return postModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        AppCompatImageView imageView;
        AppCompatTextView textView;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_posts);
            textView=itemView.findViewById(R.id.txt_title);
            cardView=itemView.findViewById(R.id.card);
        }
    }
}
