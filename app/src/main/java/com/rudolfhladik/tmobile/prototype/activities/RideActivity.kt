package com.rudolfhladik.tmobile.prototype.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rudolfhladik.tmobile.prototype.R
import kotlinx.android.synthetic.main.activity_ride.*

/**
 *
 * Created by rd on 03/12/2016.
 */
class RideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ride)

        //toolbar setup
        setSupportActionBar(mToolbarRide)


    }
}
