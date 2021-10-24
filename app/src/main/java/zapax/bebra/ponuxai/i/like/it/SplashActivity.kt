package zapax.bebra.ponuxai.i.like.it

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {

    private lateinit var lottieAnimation: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        init()
        setAnimation()
    }

    private fun init(){
        lottieAnimation = findViewById(R.id.lottieAnimation)
    }

    private fun setAnimation(){
        lottieAnimation.setAnimation("splash.json")
        lottieAnimation.repeatCount = 0
        lottieAnimation.playAnimation()

        lottieAnimation.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator?) {}

            override fun onAnimationEnd(animation: Animator?) {
                goMain()
            }

            override fun onAnimationCancel(animation: Animator?) {
                goMain()
            }

            override fun onAnimationRepeat(animation: Animator?) {}
        })
    }

    private fun goMain(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}