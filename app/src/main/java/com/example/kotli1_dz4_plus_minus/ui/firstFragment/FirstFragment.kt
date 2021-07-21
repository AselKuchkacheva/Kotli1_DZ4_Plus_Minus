package com.example.kotli1_dz4_plus_minus.ui.firstFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotli1_dz4_plus_minus.ui.MainViewModel
import com.example.kotli1_dz4_plus_minus.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding?.btnPlus?.setOnClickListener {
            viewModel.plus()
        }

        binding?.btnMinus?.setOnClickListener {
            viewModel.minus()
        }
    }
}