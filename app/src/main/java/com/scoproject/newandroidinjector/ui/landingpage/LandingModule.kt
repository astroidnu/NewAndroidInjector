package com.scoproject.newandroidinjector.ui.landingpage

import com.scoproject.newandroidinjector.di.scope.ActivityScope
import com.scoproject.newandroidinjector.ui.common.navigationcontroller.ActivityNavigation
import dagger.Module
import dagger.Provides

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
@Module
class LandingModule{
    @Provides @ActivityScope
    internal fun provideLandingActivity(landingActivity: LandingActivity): LandingContract.View {
        return landingActivity
    }

    @Provides @ActivityScope
    internal fun provideNavigationController(landingActivity: LandingActivity): ActivityNavigation{
        return ActivityNavigation(landingActivity)
    }

}