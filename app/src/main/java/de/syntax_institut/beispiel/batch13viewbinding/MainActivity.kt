package de.syntax_institut.beispiel.batch13viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import de.syntax_institut.beispiel.batch13viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //setContentView(binding.root)
        /*
        val textView = findViewById<TextView>(R.id.tv_counter)
        val button = findViewById<Button>(R.id.btn_counter)

         */
        Log.v(TAG,"Binding initialisiert")
        val textView = binding.tvCounter
        val button = binding.btnCounter
        var counter = 10

        textView.text = counter.toString()

        button.setOnClickListener {
            counter--
            Log.d(TAG,"counter bei $counter")
            try {
                val result = 100/counter
                textView.text = result.toString()
            } catch (e : Exception) {
                Log.e(TAG, "$e")
                counter = 10
            }


        }
        /*
        test_view
        TestViewBinding
         */
    }
}