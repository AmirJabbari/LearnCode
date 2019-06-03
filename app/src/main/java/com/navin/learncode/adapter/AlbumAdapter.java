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
import com.navin.learncode.model.AlbumModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.MyViewHolder> {

    Context context;
    List<AlbumModel> albumModelList=new ArrayList<>();

    public AlbumAdapter(Context context, List<AlbumModel> albums) {
        this.context = context;
        this.albumModelList = albums;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_posts,null);
        return new MyViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        AlbumModel albumModel=albumModelList.get(position);
        holder.textView.setText(albumModel.getMp3Title());
        Picasso.get().load(albumModel.getMp3ThumbnailB()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, DescriptionActivity.class);
                intent.putExtra("title",albumModel.getMp3Title());
                intent.putExtra("description",albumModel.getMp3Description());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return albumModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView textView;
        AppCompatImageView imageView;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_posts);
            textView=itemView.findViewById(R.id.txt_title);
            cardView=itemView.findViewById(R.id.card);
        }
    }
}
