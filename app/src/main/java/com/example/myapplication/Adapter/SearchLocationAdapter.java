package com.example.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchLocationAdapter extends RecyclerView.Adapter<SearchLocationAdapter.Searchclass> {
    Context context;
    SearchClick searchClick;

    public SearchLocationAdapter(Context context, SearchClick searchClick) {
        this.context = context;
        this.searchClick = searchClick;
    }

    @NonNull
    @Override
    public Searchclass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.internship_location_pojo, viewGroup, false);
        return new Searchclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Searchclass searchclass, int i) {

    }

    public interface SearchClick {
        void itemClick(int position);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class Searchclass extends RecyclerView.ViewHolder {
        public Searchclass(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @OnClick(R.id.cl_location_click)
        void onClick(View view) {
            switch (view.getId()) {
                case R.id.cl_location_click:
                    searchClick.itemClick(getAdapterPosition());
                    break;
            }
        }
    }
}
