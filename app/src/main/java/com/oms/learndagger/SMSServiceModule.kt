package com.oms.learndagger

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class SMSServiceModule() {
    //you might make typos while writing the names so we make Qualifier for them
//    @Named("sms")

    @SMSQualifier
    @Provides
    fun provideSMSService(retryCnt: Int) : NotificationService {
        return SMSService(retryCnt)
    }
}