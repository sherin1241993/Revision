package com.example.revisionproject

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_screen.*
import kotlinx.android.synthetic.main.activity_login_screen.view.*
import kotlinx.android.synthetic.main.activity_register_screen.*

class LoginScreen : AppCompatActivity() {
    var myshared : SharedPreferences?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)





        but_check_log.setOnClickListener {



            if (name_log.text.trim().isNotEmpty() && pass_log.text.isNotEmpty()) {


                //mode of file 0 private , Readable 1 ,written  2
                // make xml file his name is myshared
                myshared = getSharedPreferences("myshared", 0)
                var editor : SharedPreferences.Editor = myshared!!.edit()
                var userData = name_log.text.toString()
                var userPass = pass_log.text.toString()

                editor.apply {
                    putString("name", userData)
                    putString("pass", userPass)
                    putString("test", "Testtttttttttt")

                    apply()
                }

                var intent3 = Intent(this, RecyclerBook::class.java)
                startActivity(intent3)
            }else {

                Toast.makeText(this , "please enter your username and pass to login",Toast.LENGTH_SHORT).show()
            }

        }

        back_to_register.setOnClickListener {
            var intent4 = Intent(this , RegisterScreen::class.java)
            startActivity(intent4)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this , "app started",Toast.LENGTH_SHORT).show()


    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this , "app destroyed",Toast.LENGTH_SHORT).show()

    }
    override fun onStop() {
        Toast.makeText(applicationContext," app stopped",Toast.LENGTH_LONG).show()

        super.onStop()
    }

    override fun onRestart() {
        Toast.makeText(applicationContext,"app Restart",Toast.LENGTH_LONG).show()
        super.onRestart()
        /*
        val sharedUserName = myshared?.getString("name","")
        name_log.setText("$sharedUserName")
        val sharedUserPass = myshared?.getString("pass","")
        pass_log.setText("$sharedUserPass")
         */
    }
}