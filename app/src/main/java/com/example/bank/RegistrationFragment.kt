package com.example.bank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class RegistrationFragment : Fragment(R.layout.fragment_registration) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.btnRegister).setOnClickListener {

            val loginFragment = LoginFragment()


            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, loginFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}
