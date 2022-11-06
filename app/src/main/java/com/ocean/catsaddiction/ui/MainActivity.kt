package com.ocean.catsaddiction.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.ocean.catsaddiction.R

import com.ocean.catsaddiction.databinding.ActivityMainBinding
import com.ocean.catsaddiction.network.BASE_URL
import com.ocean.catsaddiction.viewModel.CatsAddictionViewModel


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}