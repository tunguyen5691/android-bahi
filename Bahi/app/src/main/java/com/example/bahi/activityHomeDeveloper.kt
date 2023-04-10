package com.example.bahi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class activityHomeDeveloper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_developer)

        var toggleComplistBtn = findViewById<ImageView>(R.id.toggleCompList);
        var comlistLayout = findViewById<LinearLayout>(R.id.comlistLayout);
        toggleComplistBtn.setOnClickListener {
            var  isvisible = comlistLayout.getVisibility();
            if(isvisible == View.VISIBLE){
                comlistLayout.setVisibility(View.GONE);
                toggleComplistBtn.animate().rotationBy(-40f).start()
            }else {
                comlistLayout.setVisibility(View.VISIBLE);
                toggleComplistBtn.animate().rotationBy(40f).start()
            }


        }
    }
}


