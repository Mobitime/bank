// LoginFragment.kt
package com.example.bank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var loginEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginEditText = view.findViewById(R.id.loginEditText)
        passwordEditText = view.findViewById(R.id.passwordEditText)
        loginButton = view.findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val enteredUsername = loginEditText.text.toString()
            val enteredPassword = passwordEditText.text.toString()


            if (enteredUsername.isNotEmpty() && enteredPassword.isNotEmpty()) {

                val welcomeFragment = WelcomeFragment()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, welcomeFragment)
                    .commit()
            } else {
                Toast.makeText(requireContext(), "Пожалуйста, заполните все поля", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
