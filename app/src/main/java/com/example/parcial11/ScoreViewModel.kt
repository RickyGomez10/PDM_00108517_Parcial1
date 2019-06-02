package com.example.parcial11

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel(){
    val currentScoreA: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    val currentScoreB: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    var scoreTeamA = 0
    var scoreTeamB = 0
}