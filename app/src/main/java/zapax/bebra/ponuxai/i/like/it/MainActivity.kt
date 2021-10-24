package zapax.bebra.ponuxai.i.like.it

import android.media.Rating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.graphics.Color
import android.view.View
import java.util.*

import android.view.animation.Animation
import android.view.animation.AnimationUtils


class MainActivity : AppCompatActivity() {

    private lateinit var view1: View
    private lateinit var view2: View
    private lateinit var view3: View
    private lateinit var view4: View
    private lateinit var view5: View
    private lateinit var view6: View
    private lateinit var view7: View
    private lateinit var view8: View
    private lateinit var view9: View
    private lateinit var view10: View
    private lateinit var view11: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view1 = findViewById(R.id.view1)
        view2 = findViewById(R.id.view2)
        view3 = findViewById(R.id.view3)
        view4 = findViewById(R.id.view4)
        view5 = findViewById(R.id.view5)
        view6 = findViewById(R.id.view6)
        view7 = findViewById(R.id.view7)
        view8 = findViewById(R.id.view8)
        view9 = findViewById(R.id.view9)
        view10 = findViewById(R.id.view10)
        view11 = findViewById(R.id.view11)

        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.anim)
        view1.startAnimation(animation)
        view2.startAnimation(animation)
        view3.startAnimation(animation)
        view4.startAnimation(animation)
        view5.startAnimation(animation)
        view6.startAnimation(animation)
        view7.startAnimation(animation)
        view8.startAnimation(animation)
        view9.startAnimation(animation)
        view10.startAnimation(animation)
        view11.startAnimation(animation)
    }

}