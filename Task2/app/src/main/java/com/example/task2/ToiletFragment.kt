package com.example.task2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.task2.databinding.FragmentToiletBinding

class ToiletFragment : Fragment(R.layout.fragment_toilet) {
    private var binding: FragmentToiletBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentToiletBinding.bind(view)
        binding?.endButton?.setOnClickListener {
            val bundle = MainActivity.getBundle("уборной")
            findNavController().navigate(R.id.action_toiletFragment_to_resultFragment, bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}