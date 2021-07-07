package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<studentviewholder> {
    ArrayList<Student> studentlist;

    public StudentAdapter(ArrayList<Student> studentlist) {
        this.studentlist=studentlist;
    }


    @NonNull

    @Override
    public studentviewholder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new studentviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull studentviewholder holder, int position) {
        Student student=studentlist.get(position);
        holder.setData(student);
    }

    @Override
    public int getItemCount() {
        return studentlist.size();
    }
}
