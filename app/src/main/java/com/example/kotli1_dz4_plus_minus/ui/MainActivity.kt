package com.example.kotli1_dz4_plus_minus.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kotli1_dz4_plus_minus.ui.firstFragment.FirstFragment
import com.example.kotli1_dz4_plus_minus.ui.secondFragment.SecondFragment
import com.example.kotli1_dz4_plus_minus.ui.thirdFragment.ThirdFragment
import com.example.kotli1_dz4_plus_minus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var adapterPager = PagerAdapter(this)
    private var listFragment: ArrayList<Fragment> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        createList()
        initViewPager()
    }

    private fun initViewPager() {
        adapterPager.setList(listFragment)
        binding.vpPager.adapter = adapterPager
    }

    fun createList(){
        listFragment.add(FirstFragment())
        listFragment.add(SecondFragment())
        listFragment.add(ThirdFragment())
    }
}