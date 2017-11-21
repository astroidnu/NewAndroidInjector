package com.scoproject.newandroidinjector.di.component

import android.app.Application
import com.scoproject.newandroidinjector.AndroidInjectorApp
import com.scoproject.newandroidinjector.di.module.builder.ActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        ActivityBuilder::class))
interface AppComponent{
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: AndroidInjectorApp)
}