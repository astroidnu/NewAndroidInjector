package com.scoproject.newandroidinjector.ui.login

import android.os.Bundle
import android.widget.Toast
import com.scoproject.newandroidinjector.R
import com.scoproject.newandroidinjector.ui.common.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 21/11/17.
 * Android Engineer
 * SCO Project
 */
class LoginActivity : BaseActivity(), LoginContract.View{
    @Inject
    lateinit var mLoginPresenter : LoginPresenter


    override fun getLayoutId(): Int {
       return R.layout.activity_login
    }

    override fun onActivityReady(savedInstanceState: Bundle?) {
        //Setup view for presenter
        mLoginPresenter.mView = this
        setupUIListener()
    }

    fun setupUIListener(){
        btn_submit_login.setOnClickListener {
            val username = ed_username.text.toString()
            if(mLoginPresenter.validateUsername(username)){
                showToast(getString(R.string.validate_username_valid))
            }else{
                showToast(getString(R.string.validate_username_notvalid))
            }
        }
    }

    override fun showToast(msg:String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }


}