package com.scoproject.newandroidinjector.ui.login

import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
class LoginPresenter @Inject constructor() : LoginContract.UserActionListener{
    lateinit var mView : LoginContract.View

    override fun validateUsername(username: String):Boolean{
        return username.length > 3
    }

}