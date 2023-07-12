package com.amandeep.topgames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ViewModel[] viewModels;

    MyAdapter(ViewModel[] viewModels)
    {
        this.viewModels=viewModels;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=  layoutInflater.inflate(R.layout.itemrow,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ViewModel viewModelobj=viewModels[position];
        holder.img.setImageResource(viewModelobj.getImage());
        holder.text.setText(viewModelobj.getText());


    }

    @Override
    public int getItemCount() {
        return viewModels.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView text;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text=(TextView) itemView.findViewById(R.id.tv);
            img=(ImageView)itemView.findViewById(R.id.img);
        }
    }
}
