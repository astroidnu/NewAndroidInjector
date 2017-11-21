package com.scoproject.newandroidinjector.ui.landingpage

import android.os.Bundle
import com.scoproject.newandroidinjector.R
import com.scoproject.newandroidinjector.ui.common.BaseActivity
import com.scoproject.newandroidinjector.ui.common.navigationcontroller.ActivityNavigation
import kotlinx.android.synthetic.main.activity_landing.*
import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
class LandingActivity : BaseActivity(), LandingContract.View{
    @Inject
    lateinit var mLandingPresenter : LandingPresenter

    @Inject
    lateinit var mActivityNavigation : ActivityNavigation

    override fun onActivityReady(savedInstanceState: Bundle?) {
        mLandingPresenter.mView = this
        setupUIListener()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_landing
    }

    fun setupUIListener(){
        btn_login.setOnClickListener {
            mActivityNavigation.navigateToLoginPage()
        }
    }

}