package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var controller =
            (supportFragmentManager.findFragmentById(R.id.fcvGraph) as NavHostFragment).navController
    }

    companion object {
        const val ARG_ID = "ARG_ID"
        fun createBundle(id: String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_ID, id)
            return bundle
        }
    }
}