package com.example.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

public class WallOfFameAdapter extends RecyclerView.Adapter<WallOfFameAdapter.WallClass> {
    Context context;

    public WallOfFameAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public WallClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.wall_of_fame_pojo,viewGroup,false);
        return new WallClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WallClass wallClass, int i) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class WallClass extends RecyclerView.ViewHolder {
        public WallClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
