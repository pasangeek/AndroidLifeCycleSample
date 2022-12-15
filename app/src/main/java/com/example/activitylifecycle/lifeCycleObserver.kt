package com.example.activitylifecycle
import androidx.lifecycle.Lifecycle

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class lifeCycleObserver : LifecycleObserver {
@OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
fun  registerToServer(){

}

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun  connectListner(){

    }
}