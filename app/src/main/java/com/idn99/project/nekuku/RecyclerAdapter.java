package com.idn99.project.nekuku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private ArrayList<Data> data;
    private Context context;

    public RecyclerAdapter(ArrayList<Data> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.design_list, parent, false);
        return new RecyclerViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.img.setImageResource(data.get(position).getGambarData());
        holder.tv1.setText(data.get(position).getJudulData());
        holder.tv2.setText(data.get(position).getMusimData());
    }

    @Override
    public int getItemCount() {
        return (data != null) ? data.size() : 0;
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView img;
        private TextView tv1,tv2;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_list);
            tv1 = itemView.findViewById(R.id.tv1_list);
            tv2 = itemView.findViewById(R.id.tv2_list);
        }
    }
}
