package com.example.l.beatbox;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by L on 27.12.2017.
 */

public class SoundAdapter extends RecyclerView.Adapter<SoundHolder> {
    private List<Sound> mSounds;
    private BeatBox mBeatBox;

    public SoundAdapter(List<Sound> sounds,BeatBox beatBox) {
        mSounds = sounds;
        mBeatBox=beatBox;
    }

    @Override
    public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflater=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_sound,parent,false);
        return new SoundHolder(inflater);
    }

    @Override
    public void onBindViewHolder(SoundHolder soundHolder, int position) {
        final Sound sound=mSounds.get(position);
        soundHolder.mButton.setText(sound.getName());
        soundHolder.mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBeatBox.play(sound);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mSounds.size();
    }
}
