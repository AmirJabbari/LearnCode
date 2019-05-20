package com.navin.learncode.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.navin.learncode.R;
import com.navin.learncode.model.CategoryModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    Context mcontext;
    List<CategoryModel> categoryModelList=new ArrayList<>();


    public MainAdapter(Context context, List<CategoryModel> categories) {
        this.mcontext = context;
        this.categoryModelList=categories;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final CategoryModel categoryModel=categoryModelList.get(position);
        holder.textView.setText(categoryModel.getTitle());
        Picasso.get().load(categoryModel.getImage()).into(holder.imageView);
        holder.relMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcontext,categoryModel.getTitle(),Toast.LENGTH_LONG).show();
            }
        });




    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imageView;
        AppCompatTextView textView;
        RelativeLayout relMain;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            relMain=itemView.findViewById(R.id.rel_main);
            imageView=itemView.findViewById(R.id.img_main);
            textView=itemView.findViewById(R.id.txt_title);
        }
    }

}
