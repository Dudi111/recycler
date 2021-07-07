package com.example.recycler;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class studentviewholder extends RecyclerView.ViewHolder {
    private TextView tvname;
    private TextView tvage;
    private TextView tvnumber;

    public studentviewholder(@NonNull View itemView){
        super(itemView);
        iniview(itemView);
    }
    private void iniview(View itemView){
        tvname=itemView.findViewById(R.id.tvname);
        tvage=itemView.findViewById(R.id.tvage);
        tvnumber=itemView.findViewById(R.id.tvid);
    }
    public void setData(Student student){
        tvname.setText(student.getName());
        tvage.setText(student.getAge()+"");
        tvnumber.setText(student.getRoll());
    }
}
