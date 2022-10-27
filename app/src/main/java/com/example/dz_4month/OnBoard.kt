package com.example.dz_4month

import java.io.Serializable

data class OnBoard(
    val image:String,
    val title:String?=null,
    val description:String?=null,
) : Serializable
