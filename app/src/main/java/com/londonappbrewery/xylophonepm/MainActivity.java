package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private  SoundPool mSoundPool;
    private int mNote1;
    private int mNote2;
    private int mNote3;
    private int mNote4;
    private int mNote5;
    private int mNote6;
    private int mNote7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds

        mNote1 = mSoundPool.load(getApplicationContext(),R.raw.note1_c, 1);
        mNote2 = mSoundPool.load(getApplicationContext(),R.raw.note2_d, 1);
        mNote3 = mSoundPool.load(getApplicationContext(),R.raw.note3_e, 1);
        mNote4 = mSoundPool.load(getApplicationContext(),R.raw.note4_f, 1);
        mNote5 = mSoundPool.load(getApplicationContext(),R.raw.note5_g, 1);
        mNote6 = mSoundPool.load(getApplicationContext(),R.raw.note6_a, 1);
        mNote7 = mSoundPool.load(getApplicationContext(),R.raw.note7_b, 1);

    }

    void note1(View v)
    {
        Log.d("sound :","one");
        mSoundPool.play(mNote1 , LEFT_VOLUME , RIGHT_VOLUME , PRIORITY, NO_LOOP , NORMAL_PLAY_RATE);
    }

    void note2(View v)
    {
        Log.d("sound :","one");
        mSoundPool.play(mNote2 , LEFT_VOLUME , RIGHT_VOLUME , PRIORITY, NO_LOOP , NORMAL_PLAY_RATE);
    }

    void note3(View v)
    {
        Log.d("sound :","one");
        mSoundPool.play(mNote3 , LEFT_VOLUME , RIGHT_VOLUME , PRIORITY, NO_LOOP , NORMAL_PLAY_RATE);
    }

    void note4(View v)
    {
        Log.d("sound :","one");
        mSoundPool.play(mNote4 , LEFT_VOLUME , RIGHT_VOLUME , PRIORITY, NO_LOOP , NORMAL_PLAY_RATE);
    }

    void note5(View v)
    {
        mSoundPool.play(mNote5 , LEFT_VOLUME , RIGHT_VOLUME , PRIORITY, NO_LOOP , NORMAL_PLAY_RATE);
    }


    void note6(View v)
    {
        mSoundPool.play(mNote6 , LEFT_VOLUME , RIGHT_VOLUME , PRIORITY, NO_LOOP , NORMAL_PLAY_RATE);
    }

    void note7(View v)
    {
        mSoundPool.play(mNote7 , LEFT_VOLUME , RIGHT_VOLUME , PRIORITY, NO_LOOP , NORMAL_PLAY_RATE);
    }

    // TODO: Add the play methods triggered by the buttons



}
