package com.scoproject.newandroidinjector

import android.app.Activity
import android.app.Application
import com.scoproject.newandroidinjector.di.component.AppComponent
import com.scoproject.newandroidinjector.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
class AndroidInjectorApp: Application(), HasActivityInjector{
    companion object {
        @JvmStatic lateinit var appComponent: AppComponent
    }

    @Inject
    lateinit var mActivityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        appComponent = createComponent()
        appComponent.inject(this)

    }

    /**
     * Initialize Dependency Injection With Dagger
     * Level DI Application
     * */


    fun createComponent(): AppComponent {
        val appComponent = DaggerAppComponent.builder()
                .application(this)
                .build()
        return appComponent
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return mActivityDispatchingAndroidInjector
    }

}