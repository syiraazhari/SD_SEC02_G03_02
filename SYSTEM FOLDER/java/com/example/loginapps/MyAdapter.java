package com.example.loginapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginapps.Profile.UserProfile;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<UserProfile> list;

    public MyAdapter(Context context, ArrayList<UserProfile> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        UserProfile userProfile = list.get(position);
        holder.userName.setText(userProfile.getUserName());
        holder.userEmail.setText(userProfile.getUserEmail());
        holder.userAge.setText(userProfile.getUserAge());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView userAge, userEmail,userName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            userAge= itemView.findViewById(R.id.etAge);
            userName= itemView.findViewById(R.id.etUserName);
            userEmail= itemView.findViewById(R.id.etUserEmail);
        }
    }
}
