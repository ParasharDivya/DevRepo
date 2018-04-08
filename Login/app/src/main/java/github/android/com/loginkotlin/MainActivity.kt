package github.android.com.loginkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.et_name)
        val etPswd: EditText = findViewById(R.id.et_pswd)
        val btn : Button = findViewById(R.id.button)
        val prgs:ProgressBar = findViewById(R.id.progressBar);

        btn.setOnClickListener(View.OnClickListener {
           prgs.visibility
            val text:String = etName.text.toString()
            val pswd:String = etPswd.text.toString()
            Toast.makeText(applicationContext,"Text ->${text}, Password ->${pswd}",Toast.LENGTH_LONG).show()
        })
    }
}
