package com.example.task3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.bumptech.glide.Glide
import com.example.task3.databinding.FragmentPropertyBinding

class PropertyFragment : Fragment(R.layout.fragment_property) {
    private var binding: FragmentPropertyBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPropertyBinding.bind(view)
        val id = arguments?.getString(MainActivity.ARG_ID).toString()
        val metal = MetalRepository.metalList.first{it.id == id}
        binding?.run {
            tvHardnessRes.text = metal.hardness.toString()
            tvDescriptionRes.text = metal.description
            tvNumberRes.text = metal.number.toString()
            tvMetal.text = "${metal.name} (${metal.tableName})"
            Glide.with(root).load(metal.urlStructre).into(imageView)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}