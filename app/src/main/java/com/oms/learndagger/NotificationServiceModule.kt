package com.oms.learndagger

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class NotificationServiceModule {
//    @Provides
//    fun provideNotificationService() : NotificationService{
//        return SMSService()
//    }

//    @Provides
//    fun provideNotificationService(smsService: SMSService) : NotificationService {
//        return smsService
//    }


    @Named("email")
    @Binds
    abstract fun provideEmailService(smsService: EmailService) : NotificationService
}