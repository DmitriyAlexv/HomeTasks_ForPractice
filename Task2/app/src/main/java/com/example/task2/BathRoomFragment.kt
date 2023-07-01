package com.example.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.task2.databinding.FragmentBathRoomBinding

class BathRoomFragment : Fragment(R.layout.fragment_bath_room) {
    private var binding: FragmentBathRoomBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBathRoomBinding.bind(view)
        binding?.endButton?.setOnClickListener {
            val bundle = MainActivity.getBundle("ванной")
            findNavController().navigate(R.id.action_bathRoomFragment_to_resultFragment, bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}