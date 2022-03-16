package com.example.hw10_q3.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.hw10_q3.R
import com.example.hw10_q3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding:FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        binding = FragmentHomeBinding.inflate(layoutInflater)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    //    super.onViewCreated(view, savedInstanceState)
       binding.imageView7.setOnClickListener {
          findNavController().navigate(R.id.action_nav_home_to_flower4Fragment)
       }
        binding.imageView10.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_flower2Fragment)
        }
        binding.imageView8.setOnClickListener {
           findNavController().navigate(R.id.action_nav_home_to_flower1Fragment)
        }
        binding.imageView9.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_flower3Fragment)

        }

    }

}