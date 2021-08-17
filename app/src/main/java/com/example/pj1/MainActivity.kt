package com.example.pj1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.example.pj1.databinding.ActivityMainBinding
import com.example.pj1.fragments.HomeFragment
import com.example.pj1.fragments.ListFragment
import com.example.pj1.fragments.SearchFragment
import com.example.pj1.fragments.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //앱 실행시 xml에서 보이는 shadow를 없애기 위함
        bottomNavigationView.background = null

        //2번 인덱스 placeholder의 클릭을 비활성화 하기위함
        bottomNavigationView.menu.getItem(2).isEnabled = false



    }



}