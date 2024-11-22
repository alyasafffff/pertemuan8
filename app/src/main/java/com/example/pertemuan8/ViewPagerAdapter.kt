package com.example.pertemuan8

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.pertemuan8.FriendsFragment
import com.example.pertemuan8.GithubFragment
import com.example.pertemuan8.ProfileFragment

class ViewPagerAdapter(fragmentActivity: MainActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FriendsFragment()
            1 -> GithubFragment()
            else -> ProfileFragment()
        }
    }
}