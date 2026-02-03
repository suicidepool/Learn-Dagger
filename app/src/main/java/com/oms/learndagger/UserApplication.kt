package com.oms.learndagger

import android.app.Application
import com.oms.learndagger.ui.theme.UserRegistrationService
import javax.inject.Inject

class UserApplication : Application() {

    @Inject
    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()

        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(6)
    }
}