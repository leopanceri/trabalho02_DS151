package com.leonardo.trabalho02_ds151

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //val closeBtn = findViewById<Button>(R.id.closeBtn)
        val bundle = intent.extras
        if(bundle != null){
            val user = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
                bundle.getParcelable("user", Team::class.java)
            }else{
                bundle.getParcelable("user")
            }

        }
        //closeBtn.setOnClickListener(){
        //     finish()
        //}
    }
}