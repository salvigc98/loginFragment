package com.example.android.registerform

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).displayBack()
        (activity as MainActivity).setTitle()

        btnRegister.setOnClickListener {
            (activity as MainActivity).goTo(RegisterFragment(), true)
        }

        btnResetPassword.setOnClickListener {
            (activity as MainActivity).goTo(ForgotPasswordFragment(), true)
        }

        btnLogin.setOnClickListener {
            (activity as MainActivity).goTo(EndFragment())
        }
    }

}
