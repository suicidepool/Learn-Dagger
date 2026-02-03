package com.oms.learndagger

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class UserRepositoryModule {

//    @Provides
//    fun provideUserRepository() : UserRepository {
//        return FirebaseRepository()
//    }

//   @Provides
//   fun provideUserRepository(userRepository: FirebaseRepository): UserRepository {
//       return  userRepository
//   }

    @Named("firebase")
    @Binds
    abstract fun provideFirebaseRepository(userRepository: FirebaseRepository): UserRepository


    @Named("sql")
    @Binds
    abstract fun provideSQLRepository(userRepository: SQLRepository): UserRepository
}