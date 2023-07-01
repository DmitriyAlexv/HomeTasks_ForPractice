package com.example.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.task2.databinding.FragmentResultBinding
import com.google.android.material.snackbar.Snackbar

class ResultFragment : Fragment(R.layout.fragment_result) {
    private var binding: FragmentResultBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultBinding.bind(view)
        binding?.tvEndResult?.text = arguments?.getString(MainActivity.ARG_ROOM)
        Snackbar.make(
            view,
            binding?.tvEnd?.text.toString() + binding?.tvEndResult?.text.toString(),
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}