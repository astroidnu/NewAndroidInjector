package com.scoproject.newandroidinjector.di.module.builder

import com.scoproject.newandroidinjector.di.scope.ActivityScope
import com.scoproject.newandroidinjector.ui.landingpage.LandingActivity
import com.scoproject.newandroidinjector.ui.landingpage.LandingModule
import com.scoproject.newandroidinjector.ui.login.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
@Module
abstract class ActivityBuilder{
    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(LandingModule::class))
    internal abstract fun bindLandingActivity(): LandingActivity

    @ContributesAndroidInjector
    internal abstract fun bindLoginActivity(): LoginActivity

}