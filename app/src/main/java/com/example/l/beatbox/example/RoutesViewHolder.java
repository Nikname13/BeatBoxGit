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

public class RoutesViewHolder extends RecyclerView.ViewHolder {
    public TextView mTitle, mStartStation, mEndStation;
    public View mView, mDotStart, mDotEnd, mConnector;
    public ImageView mIcon;
    public TextView mHeader, mCity;
    public LinearLayout mHeaderContainer;
    public RoutesViewHolder(View itemView) {
        super(itemView);
       /* mTitle = itemView.findViewById(R.id.rv_item_route_title_tv);
        mStartStation = itemView.findViewById(R.id.rv_item_route_start_tv);
        mEndStation = itemView.findViewById(R.id.rv_item_route_end_tv);
        mDotStart = itemView.findViewById(R.id.rv_item_route_dot_start);
        mDotEnd = itemView.findViewById(R.id.rv_item_route_dot_end);
        mConnector = itemView.findViewById(R.id.rv_item_route_connector);
        mIcon = itemView.findViewById(R.id.rv_item_route_icon);
        mHeaderContainer = itemView.findViewById(R.id.rv_item_route_header_container);
        mHeader = itemView.findViewById(R.id.rv_item_route_header_city);
        mCity = itemView.findViewById(R.id.rv_item_route_city);
        mView = itemView;*/
    }
}
