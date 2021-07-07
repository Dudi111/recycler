package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycle;
    private ArrayList<Student> studentlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        studentlist();
         setRecyclerView();
    }

    private void init(){
        recycle=findViewById(R.id.recycler);
    }
    private void studentlist(){
      studentlist=new ArrayList<>();
      Student st1=new Student("praveen",25,"masai011");
      studentlist.add(st1);
      for(int i=0;i<1300;i++){
          Student st=new Student("xyz"+i,21,"masai"+i);
          studentlist.add(st);
      }
    }
    private void setRecyclerView(){
        StudentAdapter studentadap=new StudentAdapter(studentlist);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(studentadap);
    }
}