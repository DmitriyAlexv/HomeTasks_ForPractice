package com.example.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.task2.databinding.FragmentHallBinding

class HallFragment : Fragment(R.layout.fragment_hall) {
    private var binding: FragmentHallBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHallBinding.bind(view)
        binding?.endButton?.setOnClickListener {
            val bundle = MainActivity.getBundle("гостинной")
            findNavController().navigate(R.id.action_hallFragment_to_resultFragment, bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}