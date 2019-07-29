package hu.aradipatrik.camelapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.click_me_button)
        val display = findViewById<TextView>(R.id.camel_counter)
        display.text = "Camel buck: ${CamelUtils.camelBucks}"
        button.setOnClickListener {
            CamelUtils.camelBucks++
            display.text = "Camel buck: ${CamelUtils.camelBucks}"
        }
        findViewById<Button>(R.id.go_to_store_button).setOnClickListener {
            val intent = Intent(this, CamelStoreActivity::class.java)
            intent.putExtra("Valami", 4) // this is useless here, but you can use this code to send data from the camel store, to the camel details
            startActivity(
                intent
            )
        }
    }
}
