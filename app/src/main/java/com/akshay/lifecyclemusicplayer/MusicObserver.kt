package com.akshay.lifecyclemusicplayer

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.content.Context

class MusicObserver(context: Context) : LifecycleObserver {

    private val musicManager: MusicManager by lazy { MusicManager(context) }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun timeToStartMusic() {
        musicManager.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pauseMusic() {
        musicManager.pause()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resumeMusic() {
        musicManager.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun stop() {
        musicManager.stop()
    }
}