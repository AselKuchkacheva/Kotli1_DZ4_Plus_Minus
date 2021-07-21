package com.example.kotli1_dz4_plus_minus.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.ArrayList

class PagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa){

    private var listFragment: ArrayList<Fragment> = arrayListOf()

    fun setList(list: ArrayList<Fragment>){
        listFragment.addAll(list)
    }

    override fun getItemCount(): Int {
        return listFragment.size
    }

    override fun createFragment(position: Int): Fragment {
        return listFragment.get(position)
    }
}