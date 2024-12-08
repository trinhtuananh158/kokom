package com.example.kokom.ui.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.kokom.ui.fragments.SubjectFragment

class MatchesPagerAdapter(val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    companion object {
        const val INDEX = 0
        const val TITLE = 1
        const val DATE = 2
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> SubjectFragment(INDEX)
            1 -> SubjectFragment(TITLE)
            2 -> SubjectFragment(DATE)
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            INDEX -> "Sort index"
            TITLE -> "Sort title"
            DATE -> "Sort date"
            else -> null
        }
    }
}