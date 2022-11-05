package com.ocean.catsaddiction.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.ocean.catsaddiction.databinding.ActivityMainBinding
import com.ocean.catsaddiction.network.BASE_URL
import com.ocean.catsaddiction.viewModel.CatsAddictionViewModel


class MainActivity : AppCompatActivity() {
    private val viewModel: CatsAddictionViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        Log.d("CatsApp", "activity onCreate")

        binding.nextCatB.setOnClickListener {
            viewModel.getCatsPhoto()
            binding.mainTv.setText(viewModel.newUrl)
            binding.catIv.load( BASE_URL+ viewModel.newUrl)
        }
    }
}