package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponent::class])
interface AppComponent {

    fun userManager(): UserManager
    fun registrationComponentFactory(): RegistrationComponent.RegFactory

    fun loginComponentFactory(): LoginComponent.Faktory

    @Component.Factory
    interface AppCompFactory {
        fun kreate(@BindsInstance context: Context): AppComponent
    }
}