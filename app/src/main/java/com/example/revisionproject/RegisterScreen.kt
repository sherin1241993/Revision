package com.example.revisionproject

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_login_screen.*
import kotlinx.android.synthetic.main.activity_login_screen.but_check_log
import kotlinx.android.synthetic.main.activity_register_screen.*
import kotlinx.android.synthetic.main.activity_register_screen.view.*

class RegisterScreen : AppCompatActivity() {

    val EMAIL_REGEX = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)



            but_save_reg.setOnClickListener {
                when{
                   TextUtils.isEmpty(name_reg.text.toString().trim())->{
                       name_reg.setError("please Enter Username")
                       Log.w("warning1","enter username")
                   }
                    TextUtils.isEmpty(email_reg.text.toString().trim())->{
                        email_reg.setError("please Enter email")
                        Log.w("warning2","enter email")
                    }
                    TextUtils.isEmpty(phone_reg.text.toString().trim())->{
                        phone_reg.setError("please Enter phone number")
                        Log.w("warning3","enter phone number")
                    }

                    TextUtils.isEmpty(pass_reg.text.toString().trim())->{
                        pass_reg.setError("please Enter pass")
                    }
                    name_reg.text.toString().isNotEmpty()&& email_reg.text.toString().isNotEmpty() &&
                            phone_reg.text.toString().isNotEmpty() && pass_reg.text.toString().isNotEmpty()->{

                        if(email_reg.text.toString().matches(Regex(EMAIL_REGEX))){
                            var intent4 = Intent(this, RecyclerBook::class.java)
                            startActivity(intent4)
                        }  else{
                            Toast.makeText(this, "enter valid email", Toast.LENGTH_SHORT).show()
                        }




                            }
                }


               // name_reg.text.trim().isNotEmpty() && email_reg.text.trim()
                    //    .isNotEmpty() && isEmailValid("$email_reg") && phone_reg.text.isNotEmpty() && pass_reg.text.trim()
                     //   .isNotEmpty()->

            }
            //email format
            /*
                email_reg.addTextChangedListener(object : TextWatcher {
                    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                    }

                    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                        if (Patterns.EMAIL_ADDRESS.matcher(email_reg.text.toString())
                                .matches()
                        )
                            but_save_reg.isEnabled = true
                        else {
                            but_save_reg.isEnabled = false
                            email_reg.setError("invalid Email")

                        }
                    }

                    override fun afterTextChanged(p0: Editable?) {

                    }
                })
                */


/*
    private fun validateEmptyForm(){
        when{
            TextUtils.isEmpty(name_reg.text.toString().trim())->{
                name_reg.setError("please enter your name")
            }
            TextUtils.isEmpty(phone_reg.text.toString().trim())->{
                phone_reg.setError("please enter your phone number")
            }
            TextUtils.isEmpty(pass_reg.text.toString().trim())->{
                pass_reg.setError("please enter your password")
            }


        }
      }


      if (isEmailValid("$email_reg") == false){
                     email_reg.setError("enter valid email")
                     Toast.makeText(this , "please enter valid email",Toast.LENGTH_SHORT).show()
                     }
                   else{
                        var intent4 = Intent(this, RecyclerBook::class.java)
                        startActivity(intent4)
                    }
*/

    }

    fun isEmailValid(email: String): Boolean {

        Log.d("email","email is $email")
        return EMAIL_REGEX.toRegex().matches(email)

    }
}

