package com.example.android.dagger.user

import com.example.android.dagger.di.LoggedInUserScope
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

@LoggedInUserScope
@Subcomponent
interface LoggedInUserComponent {

    fun injectMainActivity(mainActivity: MainActivity)

    fun injectSettingsActivity(settingsActivity: SettingsActivity)

    @Subcomponent.Factory
    interface LoggedInUserCompFactory {
        fun create(): LoggedInUserComponent
    }
}