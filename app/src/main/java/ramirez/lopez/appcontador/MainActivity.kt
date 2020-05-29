package ramirez.lopez.appcontador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIncr.setOnClickListener(this)
        btnDec.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v!!.id == R.id.btnIncr) {
            contador ++
        } else if (v!!.id == R.id.btnDec) {
            contador --
        }

        tvMostrar.text = "$contador"
    }
}
