package com.eegrab.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eegrab.viewbinding.databinding.FragmentSampleBinding


class SampleFragment : Fragment(R.layout.fragment_sample) {

    private lateinit var binding: FragmentSampleBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSampleBinding.bind(view)
        binding.tvFrag.text = "Chandra"
    }
}