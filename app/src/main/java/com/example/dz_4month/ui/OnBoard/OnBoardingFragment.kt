package com.example.dz_4month.ui.OnBoard


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.dz_4month.data.Preference
import com.example.dz_4month.databinding.FragmentOnBoardingBinding
import com.example.dz_4month.ui.OnBoard.adapter.OnBoardAdapter


class OnBoardingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = OnBoardAdapter(){
            Preference(requireContext()).showBoarding()
            findNavController().navigateUp()
        }

        binding.onBoarding.adapter = adapter

        val pagerSnapHelper = PagerSnapHelper()
        pagerSnapHelper.attachToRecyclerView(binding.onBoarding)

        binding.indicator.attachToRecyclerView(binding.onBoarding,pagerSnapHelper)
        adapter.registerAdapterDataObserver(binding.indicator.adapterDataObserver)
    }



}


