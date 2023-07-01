package com.example.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.task2.databinding.FragmentCorridorBinding


class CorridorFragment : Fragment(R.layout.fragment_corridor) {
    private var binding: FragmentCorridorBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCorridorBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}