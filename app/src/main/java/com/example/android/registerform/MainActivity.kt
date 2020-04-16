package com.example.android.registerform

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MainNavigation() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goTo(LoginFragment())
        setSupportActionBar(topAppBar)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == android.R.id.home) {
            goBack()
        }
        return super.onOptionsItemSelected(item)
    }

}
