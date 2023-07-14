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
    private OnItemClickListner listner;

    MyAdapter(ViewModel[] viewModels,OnItemClickListner listner)
    {

        this.viewModels=viewModels;
        this.listner=listner;
    }
    public interface OnItemClickListner {
        void onItemClick(int position);
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

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
       private TextView text;
        private  ImageView img;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            text=(TextView) itemView.findViewById(R.id.tv);
            img=(ImageView)itemView.findViewById(R.id.img);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
                int position=getAdapterPosition();
                if(position!=RecyclerView.NO_POSITION)
                {
                    listner.onItemClick(position);
                }


        }
    }
}
