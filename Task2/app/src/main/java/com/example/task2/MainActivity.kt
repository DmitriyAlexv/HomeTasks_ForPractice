package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val controller =
            (supportFragmentManager.findFragmentById(R.id.fcvGraph) as NavHostFragment).navController
        findViewById<BottomNavigationView>(R.id.bnvNavigation).apply {
            setupWithNavController(controller)
        }
    }

    companion object {
        var ARG_ROOM = "ARG_ROOM"
        fun getBundle(roomName: String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_ROOM, roomName)
            return bundle
        }
    }
}