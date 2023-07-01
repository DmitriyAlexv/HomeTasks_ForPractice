package com.example.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.task2.databinding.FragmentBedRoomBinding

class BedRoomFragment : Fragment(R.layout.fragment_bed_room) {
    private var binding: FragmentBedRoomBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBedRoomBinding.bind(view)
        binding?.endButton?.setOnClickListener {
            val bundle = MainActivity.getBundle("спальне")
            findNavController().navigate(R.id.action_bedRoomFragment_to_resultFragment, bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}