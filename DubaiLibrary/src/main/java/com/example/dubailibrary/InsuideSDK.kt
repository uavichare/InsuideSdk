package com.example.dubailibrary

import android.content.Context
import android.content.Intent

class InsuideSDK {
    // companion object SDKMethods {
         fun authenticationInsuideIndoor(context: Context, apiKey: String, apiSecretKey: String) {
         }

         fun authenticationOfMapbox(context: Context, token: String) {
         }

         fun OpenSdkScreen(c: Context) {
             var intent: Intent? = null
             try {
                 intent = Intent(c, Class.forName("com.example.buglibrary.SDKActivity"))
                 c.startActivity(intent)
             } catch (e: ClassNotFoundException) {
                 e.printStackTrace()
             }
         }

     //}


}