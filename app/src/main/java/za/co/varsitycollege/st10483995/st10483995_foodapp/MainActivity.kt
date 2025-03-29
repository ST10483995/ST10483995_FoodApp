package za.co.varsitycollege.st10483995.st10483995_foodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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
        calculateButton.setOnClickListener {
            displayTextView.text = displayText
        }
        resetButton.setOnClickListener {
            editTextView.text.clear()
        }
    }
    val editTextView = findViewById<EditText>(R.id.editTextView)
    val displayTextView = findViewById<TextView>(R.id.displayTextView)
    val calculateButton = findViewById<Button>(R.id.calculateButton)
    val resetButton = findViewById<Button>(R.id.resetButton)





    val displayText: String
        get() = when (editTextView.text.toString()) {
       "morning" -> "Eggs on Toast"
        "midmorning snack" -> "Yoghurt"
       "lunch" -> "Cheeseburger"
        "afternoon Snack" -> "Mixed Nuts"
        "dinner" -> "Steak and Mashed Potatoes"
        "evening snack" -> "Chocolate Chip Cookies"
        else -> "Invalid entry"
    }

}