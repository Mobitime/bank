package com.example.bank.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.bank.MainActivity
import com.example.bank.R
import com.example.bank.RegistrationFragment
import com.example.bank.SliderAdapter
import com.example.bank.SliderItem

class SliderFragment : Fragment(R.layout.fragment_slider) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager2: ViewPager2 = view.findViewById(R.id.viewPager2)
        val buttonNext: Button = view.findViewById(R.id.btnNext)

        val sliderAdapter = SliderAdapter(requireContext())
        viewPager2.adapter = sliderAdapter


        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)


                if (position == sliderAdapter.itemCount - 1) {
                    buttonNext.visibility = View.VISIBLE
                } else {
                    buttonNext.visibility = View.GONE
                }
            }
        })


        buttonNext.setOnClickListener {

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, RegistrationFragment())
                .commit()
        }
    }
}
