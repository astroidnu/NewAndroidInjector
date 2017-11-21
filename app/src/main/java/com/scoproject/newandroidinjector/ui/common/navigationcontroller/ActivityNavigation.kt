package com.scoproject.newandroidinjector.ui.common.navigationcontroller

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import com.scoproject.newandroidinjector.ui.login.LoginActivity
import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
class ActivityNavigation @Inject constructor(val activity:AppCompatActivity){
    /**
     * Navigate to Login Page
     * */

    fun navigateToLoginPage(){
        var intent = newIntent(activity,
                LoginActivity::class.java)
        activity.startActivity(intent)
    }

    /**
     * Intent Common Function
     * Handling new intent
     * */

    fun <T> newIntent(context: Context, cls: Class<T>): Intent {
        return Intent(context, cls)
    }

}