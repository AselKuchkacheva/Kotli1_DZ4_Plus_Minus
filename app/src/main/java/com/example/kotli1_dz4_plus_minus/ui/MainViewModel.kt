package com.example.kotli1_dz4_plus_minus.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter = MutableLiveData<Int>()
    var znaki = MutableLiveData<String>()
    var i : Int = 0

    fun plus(){
        counter.value = i ++
        znaki.value = "+"
    }

    fun minus(){
        counter.value = i --
        znaki.value = "-"
    }
}