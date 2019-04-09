package com.example.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

import java.util.zip.Inflater;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotiClass> {
    Context context;

    public NotificationAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public NotiClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.notification_pojo,viewGroup,false);
        return new NotiClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotiClass notiClass, int i) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class NotiClass extends RecyclerView.ViewHolder {
        public NotiClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
