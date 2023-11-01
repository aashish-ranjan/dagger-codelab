package com.example.android.dagger.registration

import com.example.android.dagger.di.MyActivityScope
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@MyActivityScope
@Subcomponent
interface RegistrationComponent {

    fun injectRegActivity(registrationActivity: RegistrationActivity)

    fun injectEnterDetailsFragment(enterDetailsFragment: EnterDetailsFragment)

    fun injectTermsAndConditionsFragment(termsAndConditionsFragment: TermsAndConditionsFragment)

    @Subcomponent.Factory
    interface RegFactory {
        fun create(): RegistrationComponent
    }

}