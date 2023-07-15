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
        viewModels=new ViewModel[6];
        viewModels[0]=new ViewModel(R.drawable.card1,"Horizon Chase");
        viewModels[1]=new ViewModel(R.drawable.card2,"PUBG");
        viewModels[2]=new ViewModel(R.drawable.card3,"Head Ball 2");
        viewModels[3]=new ViewModel(R.drawable.card4,"Hooked On You");
        viewModels[4]=new ViewModel(R.drawable.card5,"Fifa22 Mobile");
        viewModels[5]=new ViewModel(R.drawable.card6,"Fortnite");
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