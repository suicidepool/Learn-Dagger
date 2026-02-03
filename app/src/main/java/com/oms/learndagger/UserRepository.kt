package com.oms.learndagger

import android.util.Log
import javax.inject.Inject


interface UserRepository{
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String){
        Log.i("TAG", "User saved in SQL DB")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String){
        Log.i("TAG", "User saved in Firebase")
    }
}