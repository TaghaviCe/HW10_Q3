package com.example.hw10_q3.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.hw10_q3.R
import com.example.hw10_q3.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

   lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(ProfileViewModel::class.java)

        binding = FragmentProfileBinding.inflate(layoutInflater)
        val root: View = binding.root

//        val textView: TextView = binding.textGallery
//        galleryViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       // super.onViewCreated(view, savedInstanceState)
        val glide="https://cdn0.iconfinder.com/data/icons/flowers-and-leaves/47/flower_9-1024.png"
        if (glide !== null) {
           Glide.with(activity)
               .load(glide)
               .into(binding.imageView2)
        } else {
            binding.imageView2.setImageResource(R.drawable.profile)
        }

    }


}