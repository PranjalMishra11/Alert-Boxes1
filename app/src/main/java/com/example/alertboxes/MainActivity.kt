package com.example.alertboxes

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you Sure")
            builder1.setMessage("Do you want to close the App")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed if No is clicked
            })
            builder1.show()

        }

        binding.btn2.setOnClickListener {
            val option = arrayOf("Rasmalai","Gulab Jamun","Kaju Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet")
            builder2.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"You clicked on ${option[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                //what should happen when we click on accept
            })
            builder2.setNegativeButton("Declined",DialogInterface.OnClickListener { dialogInterface, i ->
                //action tht will happen when we click it
            } )
            builder2.show()
        }
        
        binding.btn3.setOnClickListener {

            val option = arrayOf("Rasmalai","Gulab Jamun","Kaju Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet")
            builder2.setMultiChoiceItems(option,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"You clicked on ${option[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                //what should happen when we click on accept
            })
            builder2.setNegativeButton("Declined",DialogInterface.OnClickListener { dialogInterface, i ->
                //action tht will happen when we click it
            } )
            builder2.show()
            
        }
    }
}