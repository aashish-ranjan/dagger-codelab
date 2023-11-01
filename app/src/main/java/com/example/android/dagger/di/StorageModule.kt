package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class StorageModule {

    @Binds
    abstract fun providesStorage(sharedPreferencesStorage: SharedPreferencesStorage): Storage
}