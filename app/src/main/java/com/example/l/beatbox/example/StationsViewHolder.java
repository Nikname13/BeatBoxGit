package com.example.l.beatbox.example;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.l.beatbox.R;

/**
 * Created by aleksandrkarpenko on 19.09.17.
 */

public class StationsViewHolder extends RecyclerView.ViewHolder {
    public TextView mTitle, mDescription, mCity;
    public View mView;
    public ImageView mImageView;
    public LinearLayout mHeaderContainer;
    public TextView mHeaderTitle;

    public StationsViewHolder(View itemView) {
        super(itemView);
       /* mTitle = itemView.findViewById(R.id.rv_item_station_title);
        mDescription = itemView.findViewById(R.id.rv_item_station_description);
        mImageView = itemView.findViewById(R.id.rv_item_station_icon);
        mHeaderContainer = itemView.findViewById(R.id.rv_item_station_header_container);
        mHeaderTitle = itemView.findViewById(R.id.rv_item_station_header_letter);
        mCity = itemView.findViewById(R.id.rv_item_station_city);
        mView = itemView;*/
    }
}
