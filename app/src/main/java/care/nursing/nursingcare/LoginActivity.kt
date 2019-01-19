package care.nursing.nursingcare

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val buttonLogin: Button = findViewById(R.id.button_login)
        buttonLogin.setOnClickListener { listenerLogin() }

    }

    private fun listenerLogin (){
        val etUserLogin :EditText = findViewById(R.id.et_user_login)
        val etPasswordLogin : EditText = findViewById(R.id.et_password_login)
        val userName = etUserLogin.text.toString()

        if (userName == getString(R.string.username_login)
            && etPasswordLogin.text.toString() == getString(R.string.password_login) ) {

            val sharedPreferencesFile = this.getSharedPreferences(getString(R.string.variable_name_shared_preferences),0)
            val sharedPreferencesEditor = sharedPreferencesFile!!.edit()
            sharedPreferencesEditor.putString(getString(R.string.variable_name_username),userName)
            sharedPreferencesEditor.apply()

            val intentMainActivity = Intent(this, MainActivity::class.java)
            startActivity(intentMainActivity)
            this.finish()
        }
        else{
            Toast.makeText(this, getString(R.string.toast_error_login_message), Toast.LENGTH_SHORT).show()
        }
    }

}


