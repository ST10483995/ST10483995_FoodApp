package za.co.varsitycollege.st10483995.st10483995_foodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
//    val mealTimes = {
//        "Morning, Midmorning  Snack, Lunch, Afternoon Snack, Dinner, Evening Snack"
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    //declarations for the UI components
    val editTextView = findViewById<EditText>(R.id.editTextView)
    val displayTextView = findViewById<TextView>(R.id.displayTextView)
    val calculateButton = findViewById<Button>(R.id.calculateButton)
    val resetButton = findViewById<Button>(R.id.resetButton)




    //commands for the calculate button
        calculateButton.setOnClickListener {
            val str = editTextView.text.toString()
            displayTextView.text = str
            val input = displayTextView.text.toString()
            when (input) {
                "morning" -> displayTextView.text = "Eggs on Toast"
                "midmorning snack" -> displayTextView.text = "Yoghurt"
                "lunch" -> displayTextView.text = "Cheeseburger"
                "afternoon Snack" -> displayTextView.text = "Mixed Nuts"
                "dinner" -> displayTextView.text = "Steak and Mashed Potatoes"
                "evening snack" -> displayTextView.text = "Chocolate Chip Cookies"
                else -> displayTextView.text = "Invalid entry, enter eg. morning"
            }
//            comment for clicked button
         Toast.makeText(this,
         "Food Time!", Toast.LENGTH_LONG).show()

        }
        //commands for the reset button
        resetButton.setOnClickListener {
            editTextView.text.clear()
            displayTextView.text = ""
        }
    }



}