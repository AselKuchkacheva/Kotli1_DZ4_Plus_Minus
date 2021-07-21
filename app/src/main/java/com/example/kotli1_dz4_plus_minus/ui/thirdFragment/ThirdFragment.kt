package com.example.kotli1_dz4_plus_minus.ui.thirdFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.kotli1_dz4_plus_minus.ui.MainViewModel
import com.example.kotli1_dz4_plus_minus.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private var binding: FragmentThirdBinding? = null
    private lateinit var viewModel: MainViewModel
    private var adapterZn = ZnakiAdapter()
    private lateinit var rv: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        rv = binding?.rvClicks!!
        viewModel.znaki.observe(viewLifecycleOwner, Observer {
            adapterZn.setList(it)

        })
        binding?.rvClicks?.adapter = adapterZn
    }
}