package com.example.emigrantcoffee

import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout : DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(RecyclerFragment())
        replaceFragmentCold(RecyclerColdFragment())
        replaceFragmentDessert(RecyclerDessertFragment())
        replaceFragmentWithoutCoffee(RecyclerWithOutCoffeeFragment())

        val navview: NavigationView = findViewById(R.id.navigationview)
         drawerLayout = findViewById(R.id.drawerLayout)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.app_name, R.string.qaramel)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navview.setNavigationItemSelectedListener {

            it.isChecked = true

            when(it.itemId){

                R.id.home -> replaceFragmentDrawer(DrawerHomeFragment(), it.title.toString())

                R.id.emigrantcoffee -> replaceFragmentDrawer(DeclarationFragment(), it.title.toString())

                R.id.etiyop -> replaceFragmentDrawer(EthiophiaFragment(), it.title.toString())
            }

             true

        }
    }

    private fun replaceFragmentDrawer(fragment: Fragment,title: String){

        val fragmentdrawer = supportFragmentManager
        val fragmenttransaction = fragmentdrawer.beginTransaction()
        fragmenttransaction.replace(R.id.fragmentContainerView,fragment)
        fragmenttransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }






    private fun replaceFragment(recyclerFragment: RecyclerFragment) {
        val fragmentmanager = supportFragmentManager
        val fragmentTransaction = fragmentmanager.beginTransaction()
        fragmentTransaction.equals(R.id.recyclerFragment)
        fragmentTransaction.commit()


    }
    private fun replaceFragmentCold(recyclerColdFragment: RecyclerColdFragment) {
        val coldmanager = supportFragmentManager
        val coldTransaction = coldmanager.beginTransaction()
        coldTransaction.equals(R.id.recyclerColdFragment)
        coldTransaction.commit()
    }
    private fun replaceFragmentDessert(recyclerDessertFragment: RecyclerDessertFragment){
        val dessertmanager = supportFragmentManager
        val desserttransaction = dessertmanager.beginTransaction()
        desserttransaction.equals(R.id.recyclerDessertFragment)
        desserttransaction.commit()
    }

    private fun replaceFragmentWithoutCoffee(recyclerWithOutCoffeeFragment: RecyclerWithOutCoffeeFragment){
        val withoutcoffeeManager = supportFragmentManager
        val withoutcoffeeTransaction =withoutcoffeeManager.beginTransaction()
        withoutcoffeeTransaction.equals(R.id.recyclerWithOutCoffeeFragment)
        withoutcoffeeTransaction.commit()
    }
}