package com.tecsup.evaluacionapp.vistas.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tecsup.evaluacionapp.R
import com.tecsup.evaluacionapp.vistas.plate.PlateFragment

//import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val actionBar = supportActionBar
        actionBar?.hide()

        openFragment(PlateFragment.newInstance())
    }
    private fun openFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayoutContent,fragment)
        transaction.commit()

    }
}