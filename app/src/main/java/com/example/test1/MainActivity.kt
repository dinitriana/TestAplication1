package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.test1.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil.setContentView as setContentView1


private val ViewDataBinding.navView: Any
    get(){}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = setContentView1<ActivityMainBinding>(this, R.layout.activity_main)

        val navCtrl = this.findNavController(R.id.navhost_fragment)
        NavigationUI.setupActionBarWithNavController(this, navCtrl)

        NavigationUI.setupWithNavController(binding.bottomNav, navCtrl)

    }

    override fun onNavigateUp(): Boolean {
        val navCtrl = this.findNavController(R.id.navhost_fragment)
        return navCtrl.navigateUp()
    }
}