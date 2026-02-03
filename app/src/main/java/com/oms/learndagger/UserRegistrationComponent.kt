package com.oms.learndagger

import com.oms.learndagger.ui.theme.UserRegistrationService
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class, SMSServiceModule::class])
interface UserRegistrationComponent {
//    fun provideUserRegistrationService():UserRegistrationService
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int) : UserRegistrationComponent
    }
}