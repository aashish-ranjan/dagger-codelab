package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.user.LoggedInUserComponent
import dagger.Module

@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class, LoggedInUserComponent::class])
class AppSubcomponent