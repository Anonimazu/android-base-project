package com.example.androidbaseproject.ui

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidbaseproject.databinding.ActivityMainBinding
import com.example.androidbaseproject.ui.theme.AndroidBaseProjectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initialUi()
        setupObserver()
        initialLoadData()
    }

    private fun initialLoadData() {
        viewModel.getListOfCoin()
    }

    private fun setupObserver() {
        viewModel.coinsState.observe(this) {

        }
    }

    private fun initialUi() {
        with(binding) {
            btnOpenLogin.setOnClickListener {

            }

            btnOpenCoin.setOnClickListener {

            }
        }

    }



    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        //updateCoinAdapterLayout(newConfig.orientation)
    }

}
