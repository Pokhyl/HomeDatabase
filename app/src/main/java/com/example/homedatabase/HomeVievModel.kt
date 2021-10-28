package com.example.homedatabase

import android.content.Context
import androidx.lifecycle.*
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    var message = MutableLiveData<String>()
    fun sendMessage(text: String, context: Context){
        message.value = text
        viewModelScope.launch {
            HomeDatabase.getDatabase(context).f1().insert(Home(0, text))
        }
    }
    fun list(context: Context): LiveData<List<Home>> {
        return  HomeDatabase.getDatabase(context).f1().getAll().asLiveData()
    }
}