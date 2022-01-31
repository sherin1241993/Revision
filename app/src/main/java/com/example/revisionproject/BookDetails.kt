package com.example.revisionproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import kotlinx.android.synthetic.main.activity_book_details.*

class BookDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)
        //using bundle
        val bundle = intent.extras
        val name = bundle!!.getString("name", "Default")
        val image = bundle.getInt("image",0)
        val subject = bundle.getString("subject", "Default")

        dt_Name.text = name
        dt_Image.setImageResource(image)
        dt_subject.text = subject

        /*
        //using intent
        val name = intent.getStringExtra("name")
        val image = intent.getIntExtra("image",0)
        val subject = intent.getStringExtra("subject")
        dt_Name.text = name
        dt_Image.setImageResource(image)
        dt_subject.text = subject
*/
    }



   //menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val myInflator = menuInflater
        myInflator.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.item1 -> {
                // alert dialog
                // Initialization of Instance of AlertDialog.Builder
                val builder = AlertDialog.Builder(this)

                // Sets TITLE for Alert Dialog Box
                builder.setTitle("ALERT DIALOG BOX")

                // Sets the message you want to display
                builder.setMessage("Do You Want to Uninstall this application?")

                // Creates a positive Button with a Click Listener
                builder.setPositiveButton("YES"){dialog, which ->

                    //to close the app
                   // finishAffinity()

                    var intent = Intent(this , MainActivity::class.java)
                    startActivity(intent)

                }


                // Creates a Negative Button with a Click Listener
                builder.setNegativeButton("No"){dialog,which ->
                    Toast.makeText(applicationContext,"You Stopped the Uninstall process",
                        Toast.LENGTH_SHORT).show()
                }


                // Creates a Neutral Button with a Click Listener
                builder.setNeutralButton("Cancel"){_,_ ->
                    Toast.makeText(applicationContext,"You Cancelled.", Toast.LENGTH_SHORT).show()
                }
                //  Creates an Alert Dialog and Displays it on the screen
                val dialog: AlertDialog = builder.create()
                dialog.show()
            }




        }
        return super.onOptionsItemSelected(item)
    }
}