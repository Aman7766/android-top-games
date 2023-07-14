package com.amandeep.topgames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListner {

    RecyclerView recyclerView;
    ViewModel[] viewModels;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        viewModels=new ViewModel[7];
        viewModels[0]=new ViewModel(R.drawable.burger,"Burger");
        viewModels[1]=new ViewModel(R.drawable.cake,"Cake");
        viewModels[2]=new ViewModel(R.drawable.fries,"Fries");
        viewModels[3]=new ViewModel(R.drawable.maggi,"Maggi");
        viewModels[4]=new ViewModel(R.drawable.pancake,"Pancake");
        viewModels[5]=new ViewModel(R.drawable.pasta,"Pasta");
        viewModels[6]=new ViewModel(R.drawable.pizza,"Pizza");
        myAdapter=new MyAdapter(viewModels,this);
        recyclerView.setAdapter(myAdapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this,"Game name "+viewModels[position].getText(),Toast.LENGTH_LONG).show();
    }
}