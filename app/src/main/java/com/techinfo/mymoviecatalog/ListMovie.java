package com.techinfo.mymoviecatalog;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMovie extends RecyclerView.Adapter<ListMovie.CategoryViewHolder> {
    
    private Context context;
    private ArrayList<MovieData> movieData;
    
    public ListMovie(Context context) {
        this.context = context;
    }
    
    public ArrayList<MovieData> getMovieData() {
        return movieData;
    }
    
    public void setMovieData(ArrayList<MovieData> movieList) {
        this.movieData = movieList;
    }
    
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_movie,viewGroup,false);
        return new CategoryViewHolder(itemRow);
    }
    
    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getMovieData().get(position).getName());
        categoryViewHolder.tvDescription.setText(getMovieData().get(position).getDescription());
        Glide.with(context)
                .load(getMovieData().get(position).getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(categoryViewHolder.imgPhoto);
    }
    
    @Override
    public int getItemCount() {
        return getMovieData().size();
    }
    
    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvDescription;
        ImageView imgPhoto;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDescription = itemView.findViewById(R.id.tv_item_description);
            imgPhoto = itemView.findViewById(R.id.img_photo);
        }
    }
    
    
}
