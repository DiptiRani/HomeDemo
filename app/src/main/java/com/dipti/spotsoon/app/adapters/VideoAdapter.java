package com.dipti.spotsoon.app.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dipti.spotsoon.app.R;
import com.dipti.spotsoon.app.models.Video;

import java.util.ArrayList;


public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {

    private ArrayList<Video> videoArrayList;

    public  VideoAdapter(ArrayList<Video> videoArrayList){
        this.videoArrayList = videoArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_videos, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Video items = videoArrayList.get(position);
        holder.imageViewicon.setImageResource(items.getImage());
        holder.textViewTitle.setText(String.valueOf(items.getTitle()));
        holder.textViewTime.setText(items.getTimelabel());
        holder.textViewDesc.setText(items.getDescription());
    }

    @Override
    public int getItemCount() {
        return videoArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewicon;
        TextView textViewTitle, textViewTime, textViewDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            imageViewicon = (ImageView) itemView.findViewById(R.id.imageViewIcon);
            textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            textViewTime = (TextView) itemView.findViewById(R.id.textViewTimer);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDetails);
        }
    }
}
