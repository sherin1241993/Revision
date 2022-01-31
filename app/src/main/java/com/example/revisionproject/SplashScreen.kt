package com.example.revisionproject

import android.app.AlertDialog
import android.app.Service
import android.content.Intent
import android.content.SharedPreferences
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_login_screen.*
import kotlinx.android.synthetic.main.activity_splash_screen.*


class SplashScreen : AppCompatActivity() {
    var myshared : SharedPreferences?= null
    var saveLogin :Boolean = false


    // variable for splash screen time
    private val splash: Long = 3000
    lateinit var handler: Handler

    // variables for internet connection
    var context = this
    var connectivity: ConnectivityManager? = null
    var info: NetworkInfo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //Picasso.get().load(R.drawable.jupiter).fit().into(sp_screen)



        //check if already user or not

        myshared = getSharedPreferences("myshared", 0)
        //var editor : SharedPreferences.Editor = myshared!!.edit()
        saveLogin = myshared!!.getBoolean("saveLogin",false)
        if (saveLogin == true) {
            name_log.setText(myshared!!.getString("name", ""))
            pass_log.setText(myshared!!.getString("pass", ""))

            var intent= Intent(this , RecyclerBook::class.java)
        }



        //splash screen
        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // close this activity
            finish()
        }, splash)




    //internet connection

    connectivity = context.getSystemService(Service.CONNECTIVITY_SERVICE)
    as ConnectivityManager

    if (connectivity != null)
    {
        info = connectivity!!.activeNetworkInfo

        if (info != null) {
            if (info!!.state == NetworkInfo.State.CONNECTED) {
                Toast.makeText(context, "CONNECTED TO INTERNET", Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(context, "PLEASE CHECK INTERNET CONNECTION", Toast.LENGTH_LONG).show()
        }


    }



}

    }
