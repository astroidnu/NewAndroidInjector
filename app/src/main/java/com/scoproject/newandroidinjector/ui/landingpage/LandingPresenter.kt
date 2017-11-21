package com.scoproject.newandroidinjector.ui.landingpage

import com.scoproject.newandroidinjector.ui.login.LoginContract
import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
class LandingPresenter @Inject constructor() : LandingContract.UserActionListener{
    lateinit var mView: LandingContract.View


}