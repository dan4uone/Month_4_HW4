package com.example.dz_4month.data

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class Preference(private val context: Context) {
    private  var preference: SharedPreferences =
         context.getSharedPreferences("simple_data",MODE_PRIVATE)


    fun getIsShowBoarding():Boolean{
        return preference.getBoolean("is_show",false)
    }
    fun showBoarding(isShow:Boolean){
        preference.edit().putBoolean("is_show",true).apply()
    }

    fun setProfileImage(url :String){
        preference.edit().putString("profile_image",url).apply()
    }
    fun setName(name :String){
        preference.edit().putString("pref_image",name).apply()
    }
    fun getName():String= preference.getString("pref_image","").toString()

    fun getProfileImage():String = preference.getString("profile_image","").toString()
    fun showBoarding() {
        TODO("Not yet implemented")
    }

}