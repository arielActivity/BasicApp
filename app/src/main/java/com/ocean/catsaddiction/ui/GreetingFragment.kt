package com.ocean.catsaddiction.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ocean.catsaddiction.R
import com.ocean.catsaddiction.databinding.FragmentGreetingBinding

class GreetingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGreetingBinding.inflate(inflater)

        binding.startButton.setOnClickListener {
            findNavController().navigate(R.id.action_greetingFragment_to_catsFragment)
        }

        return binding.root
    }

}