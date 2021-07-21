package com.example.kotli1_dz4_plus_minus.ui.secondFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotli1_dz4_plus_minus.ui.MainViewModel
import com.example.kotli1_dz4_plus_minus.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        viewModel.counter.observe(viewLifecycleOwner, Observer {
            binding?.tvSecond?.text = it.toString()
        })
    }
}