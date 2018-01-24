package com.akshay.lifecyclemusicplayer

import android.content.Context
import android.media.MediaPlayer

class MusicManager(context: Context) {

    private var mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.song)

    fun start() {
        mediaPlayer.start()
    }

    fun pause() {
        mediaPlayer.pause()
    }

    fun stop() {
        mediaPlayer.stop()
        mediaPlayer.release()
    }
}