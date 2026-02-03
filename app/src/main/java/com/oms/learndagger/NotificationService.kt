package com.oms.learndagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, body:String?)
}

@ApplicationScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.i("TAG", "Email: $body")
    }
}

class SMSService @Inject constructor(val retryCnt: Int) : NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.i("TAG", "SMS: $body, retryCnt: $retryCnt")
    }
}