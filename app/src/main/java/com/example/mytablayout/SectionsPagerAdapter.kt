package com.example.mytablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    //Study case: Misal dibutuhkan 20 tampilan fragment CARA 1 akan membebani memori
    //MEMBUAT TAB LAYOUT DG 1 FRAGMENT
    //Dipakai ketika data&layout yg akan ditampilkan mirip antar tab
    //Jadi, pda CARA 1 ad 2 fragment. CARA 2 hnya ada HomeFragment()
    //Sistematika = hnya replace text melalui companion object(Main Activity) berdasarkan posisi
    //Alasan diberi +1: position dimulai dri 0
    //Urutan Tab Dimulai dari nilai 1
    override fun createFragment(position: Int): Fragment {
        val fragment = HomeFragment()

        //Mengirim data bundle ke fragment
        fragment.arguments = Bundle().apply {
            //mapping(Key, Value)
            putInt(HomeFragment.ARG_SECTION_NUMBER, position + 1)
        }
        return fragment
    }

    //Create per Fragment(CARA 1)
    //Dipakai saat layout yg ditmpilkan sangat berbeda
//    override fun createFragment(position: Int): Fragment {
//        var fragment: Fragment? = null
//        when (position) {
//            0 -> fragment = HomeFragment()
//            1 -> fragment = ProfileFragment()
//        }
//        return fragment as Fragment
//    }

}