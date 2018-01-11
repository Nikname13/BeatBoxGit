package com.example.l.beatbox;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by L on 27.12.2017.
 */

public class SoundHolder  extends RecyclerView.ViewHolder{

    public Button mButton;
    public Sound mSound;

    public SoundHolder(View itemView){
        super(itemView);
        mButton=(Button)itemView.findViewById(R.id.list_item_sound_button);
    }
}
