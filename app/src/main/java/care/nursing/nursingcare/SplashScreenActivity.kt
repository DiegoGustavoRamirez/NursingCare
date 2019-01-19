package care.nursing.nursingcare

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        checkSession()
    }

    private fun checkSession(){
        val spFile = this.getSharedPreferences(getString(R.string.variable_name_shared_preferences), 0) // parameters: name file, mode

        val intent = if (spFile.getString(getString(R.string.variable_name_username), "") == getString(R.string.username_login))
                                Intent(this, MainActivity::class.java)
                                else
                                Intent(this, LoginActivity::class.java)
        startActivity(intent)
        this.finish()
    }

}
