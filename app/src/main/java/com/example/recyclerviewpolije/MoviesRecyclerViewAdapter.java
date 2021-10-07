package com.example.recyclerviewpolije;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesRecyclerViewAdapter extends RecyclerView.Adapter<MoviesRecyclerViewAdapter.MovieViewholder> {
    ArrayList<Movies> arrayListMovies;

    public MoviesRecyclerViewAdapter(ArrayList<Movies> arrayListMovies) {
        this.arrayListMovies = arrayListMovies;
    }
    //    Mengambil layout dari item.xml
    @NonNull
    @Override
    public MoviesRecyclerViewAdapter.MovieViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MovieViewholder(view);
    }

    //    Untuk meng get data setiap index dari array list
    @Override
    public void onBindViewHolder(@NonNull MoviesRecyclerViewAdapter.MovieViewholder holder, int position) {
        final  Movies movies = arrayListMovies.get(position);

        holder.textViewTitle.setText(movies.getTitle());
        holder.textViewRating.setText(movies.getRating());
        holder.textViewReleaseDate.setText(movies.getReleasedate());

        //        Memberi Action ketika di klik akan menampilkan detailnya
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailMovieActivity.class);
                intent.putExtra("MOVIES", movies);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    //          Jumlah data
    @Override
    public int getItemCount() {
        return arrayListMovies.size();
    }

    //        deklarasi widget/view yang ada di dalam item
    public class MovieViewholder extends RecyclerView.ViewHolder{
        TextView textViewTitle, textViewRating, textViewReleaseDate;

        public MovieViewholder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.tvTitle);
            textViewRating = itemView.findViewById(R.id.tvRating);
            textViewReleaseDate = itemView.findViewById(R.id.tvReleaseDate);
        }
    }
}