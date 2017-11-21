package com.scoproject.newandroidinjector.ui.login

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
class LoginContract{
    interface View{
        fun showToast(msg:String)
    }
    interface UserActionListener{
        fun validateUsername(username:String):Boolean
    }
}