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

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.InternshipClass> {

    Context context;
    RcItemClick itemClick;
    public HomeAdapter(Context context,RcItemClick itemClick) {
        this.context = context;
        this.itemClick=itemClick;
    }

    @NonNull
    @Override
    public InternshipClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.activity_home_pojo, viewGroup, false);
        return new InternshipClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InternshipClass internshipClass, int i) {

    }
    public interface RcItemClick
    {
        void itemClickListener(int position);
    }
    @Override
    public int getItemCount() {
        return 5;
    }

    public class InternshipClass extends RecyclerView.ViewHolder {
        public InternshipClass(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.cl_item_Click)
        void onclick(View view)
        {
            switch (view.getId())
            {
                case R.id.cl_item_Click:
                    itemClick.itemClickListener(getAdapterPosition());
                    break;
            }
        }
    }
}
