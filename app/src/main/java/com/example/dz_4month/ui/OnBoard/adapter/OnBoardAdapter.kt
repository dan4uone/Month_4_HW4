package com.example.dz_4month.ui.OnBoard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.dz_4month.OnBoard
import com.example.dz_4month.databinding.ItemOnBoardingPageBinding
import com.example.dz_4month.loadImage

class OnBoardAdapter(private val onClick:()->Unit):RecyclerView.Adapter <OnBoardAdapter.OnBoardViewHolder>(){

    private val arrayListBoarding = arrayListOf<OnBoard>()
        init {

            arrayListBoarding.add( OnBoard("https://ru.wikipedia.org/wiki/Opel_Astra#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Opel_Astra_J_1.4_ecoFLEX_Edition_front_20100725.jpg",
                "Opel","Astra"
            )
            )
            arrayListBoarding.add(  OnBoard("https://ru.wikipedia.org/wiki/Kia_Rio#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Berline_Kia_Rio_2018_au_SIAM_2018",
                "Kia","Rio"
            )
            )
            arrayListBoarding.add(   OnBoard("https://ru.wikipedia.org/wiki/Honda_Pilot#/media/%D0%A4%D0%B0%D0%B9%D0%BB:2016_Honda_Pilot.jpg",
                "Honda","Pilot")
            )
            arrayListBoarding.add(  OnBoard("https://ru.wikipedia.org/wiki/Nissan_Patrol#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Safari(sdfPatrol).jpg",
                "Nissan","Patrol")
            )
            arrayListBoarding.add( OnBoard("https://ru.wikipedia.org/wiki/Subaru_Tribeca#/media/%D0%A4%D0%B0%D0%B9%D0%BB:2008_Subaru_Tribeca.jpg",
                "Subaru","Tribeca")


            )
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardViewHolder {
       return OnBoardViewHolder(
           ItemOnBoardingPageBinding.inflate(LayoutInflater.from(parent.context),
           parent,false))

    }

    override fun onBindViewHolder(holder: OnBoardViewHolder, position: Int) {
        holder.bind(arrayListBoarding[position])
    }

    override fun getItemCount(): Int = arrayListBoarding.size


    inner class OnBoardViewHolder(private val binding: ItemOnBoardingPageBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun bind(onBoard: OnBoard) {
            binding.skip.setOnClickListener{onClick()}
            binding.btnStart.setOnClickListener{onClick()}
            binding.skip.isVisible = adapterPosition!= arrayListBoarding.size-1
            binding.btnStart.isVisible = adapterPosition== arrayListBoarding.size-1
            binding.tvTitle.text = onBoard.title
            binding.tvDescription.text = onBoard.description
            binding.imagePager.loadImage(onBoard.image)
        }

    }


}


