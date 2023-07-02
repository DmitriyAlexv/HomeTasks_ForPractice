package com.example.task3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.task3.databinding.FragmentListOfMetalsBinding

class ListOfMetalsFragment : Fragment(R.layout.fragment_list_of_metals) {
    private var adapter: MetalAdapter? = null
    private var binding: FragmentListOfMetalsBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListOfMetalsBinding.bind(view)
        initAdapter()
    }

    private fun initAdapter() {
        adapter = MetalAdapter(
            MetalRepository.metalList
        ) { metal: Metal ->
            val bundle = MainActivity.createBundle(metal.id)
            findNavController().navigate(
                R.id.action_listOfMetalsFragment_to_propertyFragment,
                bundle
            )
        }
        binding?.rvMetals?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}