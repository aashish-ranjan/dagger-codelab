package com.example.android.dagger.login

import com.example.android.dagger.di.MyActivityScope
import dagger.Subcomponent

@MyActivityScope
@Subcomponent
interface LoginComponent {

    fun injectLoginActivity(loginActivity: LoginActivity)

    @Subcomponent.Factory
    interface Faktory {
        fun kreate(): LoginComponent
    }

}