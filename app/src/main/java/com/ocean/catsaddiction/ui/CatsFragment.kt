package com.ocean.catsaddiction.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.ocean.catsaddiction.R
import com.ocean.catsaddiction.databinding.FragmentCatsBinding
import com.ocean.catsaddiction.network.BASE_URL
import com.ocean.catsaddiction.viewModel.CatsAddictionViewModel
import coil.load


class CatsFragment : Fragment() {

    private val viewModel: CatsAddictionViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCatsBinding.inflate(inflater)

        Log.d("CatsApp", "activity onCreate")

        binding.nextCatB.setOnClickListener {
            viewModel.getCatsPhoto()
            binding.mainTv.setText(viewModel.newUrl)
            binding.catIv.load( BASE_URL + viewModel.newUrl)
        }
        return binding.root
    }

}