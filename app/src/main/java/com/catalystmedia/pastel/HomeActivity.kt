package com.catalystmedia.pastel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.catalystmedia.pastel.fragments.ActivityFragment
import com.catalystmedia.pastel.fragments.HealthFragment
import com.catalystmedia.pastel.fragments.HomeFragment
import com.catalystmedia.pastel.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val firstFragment= ActivityFragment()
        val secondFragment=HealthFragment()
        val thirdFragment=HomeFragment()
        val fourthFragment=ProfileFragment()

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.activity->setCurrentFragment(firstFragment)
                R.id.health->setCurrentFragment(secondFragment)
                R.id.home->setCurrentFragment(thirdFragment)
                R.id.profile->setCurrentFragment(fourthFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

}
