package com.example.revisionproject

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_login_screen.*
import kotlinx.android.synthetic.main.activity_recycler_book.*

class RecyclerBook : AppCompatActivity() , OnDetailsClickListnear{
    @SuppressLint("WrongConstant")
    val users = ArrayList<data>()
    var myshared : SharedPreferences?= null



    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_book)

        users.add(data("هيبيتا","محمد صادق" , R.drawable.hebta,
            "في قلب حارة اليهود في الجنوب التونسي تتشابك الأحداث حول المسلمة اليتيمة " +
                    "التي تربت بين أحضان عائلة يهودية، و بين ثنايا " +
                    "مدينة قانا العتيقة في الجنوب اللبناني تدخل بلبلة غير متوقعة في " +
                    "حياة ندى التي نشأت على اليهودية بعيدا عن " +
                    "والدها المسلم. تتتابع اللقاءات و الأحداث المثيرة حولهما لتخرج كلا " +
                    "منهما من حياة الرتابة و تسير بها إلى موعد مع القدر. (في قلبي أنثى عبرية) " +
                    "رواية مستوحاة من أحداث حقيقية في قالب روائي مشوق "))
        users.add(data("واأسلاماه","علي احمد" , R.drawable.w_islamah,
            "في قلب حارة اليهود في الجنوب التونسي تتشابك الأحداث حول المسلمة اليتيمة " +
                    "التي تربت بين أحضان عائلة يهودية، و بين ثنايا " +
                    "مدينة قانا العتيقة في الجنوب اللبناني تدخل بلبلة غير متوقعة في " +
                    "حياة ندى التي نشأت على اليهودية بعيدا عن " +
                    "والدها المسلم. تتتابع اللقاءات و الأحداث المثيرة حولهما لتخرج كلا " +
                    "منهما من حياة الرتابة و تسير بها إلى موعد مع القدر. (في قلبي أنثى عبرية) " +
                    "رواية مستوحاة من أحداث حقيقية في قالب روائي مشوق "))
        users.add(data("تراب الماس","احمد مراد" , R.drawable.trab_elmas,
            "في قلب حارة اليهود في الجنوب التونسي تتشابك الأحداث حول المسلمة اليتيمة " +
                    "التي تربت بين أحضان عائلة يهودية، و بين ثنايا " +
                    "مدينة قانا العتيقة في الجنوب اللبناني تدخل بلبلة غير متوقعة في " +
                    "حياة ندى التي نشأت على اليهودية بعيدا عن " +
                    "والدها المسلم. تتتابع اللقاءات و الأحداث المثيرة حولهما لتخرج كلا " +
                    "منهما من حياة الرتابة و تسير بها إلى موعد مع القدر. (في قلبي أنثى عبرية) " +
                    "رواية مستوحاة من أحداث حقيقية في قالب روائي مشوق "))
        users.add(data("يوتوبيا", "احمد خالد توفيق", R.drawable.youtubea,
            "في قلب حارة اليهود في الجنوب التونسي تتشابك الأحداث حول المسلمة اليتيمة " +
                    "التي تربت بين أحضان عائلة يهودية، و بين ثنايا " +
                    "مدينة قانا العتيقة في الجنوب اللبناني تدخل بلبلة غير متوقعة في " +
                    "حياة ندى التي نشأت على اليهودية بعيدا عن " +
                    "والدها المسلم. تتتابع اللقاءات و الأحداث المثيرة حولهما لتخرج كلا " +
                    "منهما من حياة الرتابة و تسير بها إلى موعد مع القدر. (في قلبي أنثى عبرية) " +
                    "رواية مستوحاة من أحداث حقيقية في قالب روائي مشوق "))
        users.add(data("هيبيتا","محمد صادق" , R.drawable.hebta,
            "في قلب حارة اليهود في الجنوب التونسي تتشابك الأحداث حول المسلمة اليتيمة " +
                    "التي تربت بين أحضان عائلة يهودية، و بين ثنايا " +
                    "مدينة قانا العتيقة في الجنوب اللبناني تدخل بلبلة غير متوقعة في " +
                    "حياة ندى التي نشأت على اليهودية بعيدا عن " +
                    "والدها المسلم. تتتابع اللقاءات و الأحداث المثيرة حولهما لتخرج كلا " +
                    "منهما من حياة الرتابة و تسير بها إلى موعد مع القدر. (في قلبي أنثى عبرية) " +
                    "رواية مستوحاة من أحداث حقيقية في قالب روائي مشوق "))
        users.add(data("واأسلاماه","علي احمد" , R.drawable.w_islamah,
            "في قلب حارة اليهود في الجنوب التونسي تتشابك الأحداث حول المسلمة اليتيمة " +
                    "التي تربت بين أحضان عائلة يهودية، و بين ثنايا " +
                    "مدينة قانا العتيقة في الجنوب اللبناني تدخل بلبلة غير متوقعة في " +
                    "حياة ندى التي نشأت على اليهودية بعيدا عن " +
                    "والدها المسلم. تتتابع اللقاءات و الأحداث المثيرة حولهما لتخرج كلا " +
                    "منهما من حياة الرتابة و تسير بها إلى موعد مع القدر. (في قلبي أنثى عبرية) " +
                    "رواية مستوحاة من أحداث حقيقية في قالب روائي مشوق "))
        users.add(data("تراب الماس","احمد مراد" , R.drawable.trab_elmas,
            "في قلب حارة اليهود في الجنوب التونسي تتشابك الأحداث حول المسلمة اليتيمة " +
                    "التي تربت بين أحضان عائلة يهودية، و بين ثنايا " +
                    "مدينة قانا العتيقة في الجنوب اللبناني تدخل بلبلة غير متوقعة في " +
                    "حياة ندى التي نشأت على اليهودية بعيدا عن " +
                    "والدها المسلم. تتتابع اللقاءات و الأحداث المثيرة حولهما لتخرج كلا " +
                    "منهما من حياة الرتابة و تسير بها إلى موعد مع القدر. (في قلبي أنثى عبرية) " +
                    "رواية مستوحاة من أحداث حقيقية في قالب روائي مشوق "))
        users.add(data("يوتوبيا", "احمد خالد توفيق", R.drawable.youtubea,
            "في قلب حارة اليهود في الجنوب التونسي تتشابك الأحداث حول المسلمة اليتيمة " +
                    "التي تربت بين أحضان عائلة يهودية، و بين ثنايا " +
                    "مدينة قانا العتيقة في الجنوب اللبناني تدخل بلبلة غير متوقعة في " +
                    "حياة ندى التي نشأت على اليهودية بعيدا عن " +
                    "والدها المسلم. تتتابع اللقاءات و الأحداث المثيرة حولهما لتخرج كلا " +
                    "منهما من حياة الرتابة و تسير بها إلى موعد مع القدر. (في قلبي أنثى عبرية) " +
                    "رواية مستوحاة من أحداث حقيقية في قالب روائي مشوق "))




        recycler_book.layoutManager = LinearLayoutManager(this , LinearLayout.VERTICAL,false)
        val adapter = CustomAdapter(users , this)
        recycler_book.adapter = adapter



    }









    //passing data from recycler with interface
    override fun onDetailsClickListnear(position: Int) {

   Toast.makeText(this , "book number"+position+"clicked",Toast.LENGTH_SHORT).show()

        var intent = Intent(this , BookDetails::class.java)
        intent.putExtra("name", users[position].bookName)
        intent.putExtra("image",users[position].bookImage)
        intent.putExtra("subject",users[position].description)
        startActivity(intent)
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

                    // Displays a Toast Message on Positive Button click
                    Toast.makeText(applicationContext,"The Appliciation will be uninstalled now",
                        Toast.LENGTH_SHORT).show()
                    //to close the app
                    //finishAffinity()


                    var intent = Intent(this , LoginScreen::class.java)
                    startActivity(intent)


                }


                // Creates a Negative Button with a Click Listener
                builder.setNegativeButton("No"){dialog,which ->
                    Toast.makeText(applicationContext,"You Stopped the Uninstall process",
                        Toast.LENGTH_SHORT).show()
                }


                // Creates a Neutral Button with a Click Listener
                builder.setNeutralButton("Cancel"){_,_ ->
                    Toast.makeText(applicationContext,"You Cancelled.",Toast.LENGTH_SHORT).show()
                }
                //  Creates an Alert Dialog and Displays it on the screen
                val dialog: AlertDialog = builder.create()
                dialog.show()
            }




            }
        return super.onOptionsItemSelected(item)
        }

    }


