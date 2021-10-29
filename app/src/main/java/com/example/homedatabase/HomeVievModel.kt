package com.example.homedatabase

import android.content.Context
import androidx.lifecycle.*
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(var homeDatabase: HomeDatabase): ViewModel() {


    var message = MutableLiveData<String>()
    fun sendMessage(text: String){
        println(text+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
        message.value = text
        viewModelScope.launch {
            homeDatabase.f1().insert(Home(0, text))
        }
    }
    fun list(): LiveData<List<Home>> {
        var x =  homeDatabase.f1().getAll().asLiveData()
        println("$x????????????????????????????????????????????")
        return x
    }
}