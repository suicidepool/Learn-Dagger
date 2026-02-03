package com.oms.learndagger.ui.theme

import com.oms.learndagger.EmailService
import com.oms.learndagger.NotificationService
import com.oms.learndagger.SMSQualifier
import com.oms.learndagger.UserRepository
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    @param:Named("sql")
    private val userRepository: UserRepository,

    @param:SMSQualifier
    private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        notificationService.send(email, from = "sakalakaboombooom@gmail.com", "User registered.")
    }
}