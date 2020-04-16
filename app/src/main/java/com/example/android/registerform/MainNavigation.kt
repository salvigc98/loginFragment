package com.example.android.registerform

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

abstract class MainNavigation: AppCompatActivity() {

    fun goTo(fragment: Fragment, isBack: Boolean = false) {

        var navigation = supportFragmentManager.beginTransaction().replace(R.id.mainContainer, fragment)

        if (isBack) {
            navigation.addToBackStack(fragment.toString())
        }

        navigation.commit()
    }

    fun goBack() {
        supportFragmentManager.popBackStackImmediate()
    }

    fun displayBack(isDisplay: Boolean = false) {
        supportActionBar!!.setDisplayHomeAsUpEnabled(isDisplay)
    }

    fun setTitle(title: String = getString(R.string.page_title)) {
        supportActionBar!!.title = title
    }
}