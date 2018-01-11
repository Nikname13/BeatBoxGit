package com.example.l.beatbox.example;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.l.beatbox.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


/**
 * Created by aleksandrkarpenko on 19.09.17.
 */

public class TransportAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
  /*  private Context mContext;
    private ItemTouchHelper.SimpleCallback mSimpleCallback;
    private Paint mPaint = new Paint();
    private List<Station> mStations = new ArrayList<>(0);
    private List<Route> mRoutes = new ArrayList<>(0);
    private LinkedHashMap<String, Integer> mStationsHeadersMapIndex;
    private LinkedHashMap<String, Integer> mRouteHeadersMapIndex;

    enum ViewType {
        STATIONS, ROUTES
    }

    private ViewType mCurrentViewType = ViewType.STATIONS;

    private StationListener mStationListener;

    private RouteListener mRouteListener;

    public TransportAdapter setStationListener(StationListener stationListener) {
        mStationListener = stationListener;
        return this;
    }

    public TransportAdapter setRouteListener(RouteListener routeListener) {
        mRouteListener = routeListener;
        return this;
    }

    public void setType(ViewType type) {
        mCurrentViewType = type;
    }

    public interface StationListener {
        void onViewClick(Station station);

        void onFavoriteCallback(Station station);
    }

    public interface RouteListener {
        void onViewClick(Route route);

        void onFavoriteCallBack(Route route);
    }

    public TransportAdapter(Context context) {
        mContext = context;
        initSwipe();
    }

    public void setStations(List<Station> stations) {
        mStations = stations;
        mCurrentViewType = ViewType.STATIONS;
        fillStationsHeaders();
        notifyDataSetChanged();
    }

    public void setRoutes(List<Route> routes) {
        mRoutes = routes;
        mCurrentViewType = ViewType.ROUTES;
        fillRoutesHeaders();
        notifyDataSetChanged();
    }*/

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       /* switch (mCurrentViewType) {
            case STATIONS:
                View stationView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.rv_item_station, parent, false);
                return new StationsViewHolder(stationView);
            case ROUTES:
                View routeView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.rv_item_route, parent, false);
                return new RoutesViewHolder(routeView);
            default:
                return null;
        }*/
       return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        /*if (holder instanceof StationsViewHolder & mStations.size() > 0) {
            StationsViewHolder stationsViewHolder = (StationsViewHolder) holder;
            final Station station = mStations.get(position);
            stationsViewHolder.mTitle.setText(station.getName());
            stationsViewHolder.mDescription.setText(station.getDescription());
            stationsViewHolder.mCity.setText(station.getCity() != null ? station.getCity() : "Нет данных о городе");
            stationsViewHolder.mImageView.setImageDrawable(AppCompatResources.getDrawable(mContext, station.isFavorite() ? R.drawable.ic_bus_stop_favorite_24dp : R.drawable.bus_stop_teal));

            stationsViewHolder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mStationListener != null) {
                        mStationListener.onViewClick(station);
                    }
                }
            });

            if (mStationsHeadersMapIndex.get(String.valueOf(station.getName().toUpperCase().charAt(0))) == position && !station.isFavorite()) {
                stationsViewHolder.mHeaderContainer.setVisibility(View.VISIBLE);
                stationsViewHolder.mHeaderTitle.setText(String.valueOf(station.getName().toUpperCase().charAt(0)));
            } else {
                stationsViewHolder.mHeaderContainer.setVisibility(View.GONE);
            }
        }

        if (holder instanceof RoutesViewHolder & mRoutes.size() > 0) {
            RoutesViewHolder routesViewHolder = (RoutesViewHolder) holder;
            final Route route = mRoutes.get(position);
            routesViewHolder.mTitle.setText(route.getName());
            routesViewHolder.mCity.setText(route.getCity() != null ? route.getCity() : "Нет данных о городе");
            routesViewHolder.mIcon.setImageDrawable(AppCompatResources.getDrawable(mContext, route.isFavorite() ? R.drawable.ic_directions_bus_fav_24dp : R.drawable.ic_directions_bus));
            routesViewHolder.mStartStation.setText(route.getStartStationName());
            routesViewHolder.mEndStation.setText(route.getEndStationName());

            routesViewHolder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mRouteListener != null) {
                        mRouteListener.onViewClick(route);
                    }
                }
            });

            if (mRouteHeadersMapIndex.get(route.getCity()) == position && !route.isFavorite()) {
                routesViewHolder.mHeaderContainer.setVisibility(View.VISIBLE);
                routesViewHolder.mHeader.setText(route.getCity() != null ? route.getCity() : "Нет данных о городе");
            } else {
                routesViewHolder.mHeaderContainer.setVisibility(View.GONE);
            }
        }*/
    }

    @Override
    public int getItemCount() {
       /* switch (mCurrentViewType) {
            case STATIONS:
                return mStations.size();
            case ROUTES:
                return mRoutes.size();
            default:
                return 0;
        }*/
       return 0;
    }

    /*private void initSwipe() {
        mSimpleCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                int position = viewHolder.getAdapterPosition();
                if (direction == ItemTouchHelper.LEFT) {
                    if (mStationListener != null && mCurrentViewType == ViewType.STATIONS) {
                        mStations.get(position).setFavorite(!mStations.get(position).isFavorite());
                        mStationListener.onFavoriteCallback(mStations.get(position));
                    }

                    if (mRouteListener != null && mCurrentViewType == ViewType.ROUTES) {
                        mRoutes.get(position).setFavorite(!mRoutes.get(position).isFavorite());
                        mRouteListener.onFavoriteCallBack(mRoutes.get(position));
                    }

                    notifyItemChanged(position);
                }
            }

            @Override
            public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
                Bitmap icon;
                if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {
                    View itemView = viewHolder.itemView;
                    if (dX < 0) {
                        mPaint.setColor(mContext.getResources().getColor(R.color.material_indigo_500));
                        RectF background = new RectF((float) itemView.getRight() + dX, (float) itemView.getTop(), (float) itemView.getRight(), (float) itemView.getBottom());
                        c.drawRect(background, mPaint);
                        int fav_border = R.drawable.ic_favorite_border_white_24dp;
                        int fav_solid = R.drawable.ic_favorite_white_24dp;
                        switch (mCurrentViewType) {
                            case STATIONS:
                                icon = DrawableUtil.getBitmapFromVectorDrawable(mContext, mStations.get(viewHolder.getAdapterPosition()).isFavorite() ? fav_border : fav_solid);
                                break;
                            case ROUTES:
                                icon = DrawableUtil.getBitmapFromVectorDrawable(mContext, mRoutes.get(viewHolder.getAdapterPosition()).isFavorite() ? fav_border : fav_solid);
                                break;
                            default:
                                icon = DrawableUtil.getBitmapFromVectorDrawable(mContext, R.drawable.ic_favorite_border_white_24dp);
                                break;
                        }
                        float side = icon.getWidth();
                        RectF icon_dest = new RectF((float) itemView.getRight() - side * 2,
                                (float) itemView.getTop() + side,
                                (float) itemView.getRight() - side,
                                (float) itemView.getTop() + side * 2);
                        c.drawBitmap(icon, null, icon_dest, mPaint);
                    }
                }
                super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
            }
        };
    }

    public ItemTouchHelper.SimpleCallback getSimpleCallback() {
        return mSimpleCallback;
    }

    private void fillStationsHeaders() {
        mStationsHeadersMapIndex = new LinkedHashMap<>();
        for (Station station : mStations) {
            String name = station.getName().toUpperCase();
            if (name.length() > 1) {
                String letter = String.valueOf(name.charAt(0));
                if (!mStationsHeadersMapIndex.containsKey(letter)) {
                    mStationsHeadersMapIndex.put(letter, mStations.indexOf(station));
                }
            }
        }
    }

    private void fillRoutesHeaders() {
        mRouteHeadersMapIndex = new LinkedHashMap<>();
        for (Route route : mRoutes) {
            String city = route.getCity();
            if (!mRouteHeadersMapIndex.containsKey(city)) {
                mRouteHeadersMapIndex.put(city, mRoutes.indexOf(route));
            }
        }
    }*/
}