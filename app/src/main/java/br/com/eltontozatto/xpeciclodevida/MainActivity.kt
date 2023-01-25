package br.com.eltontozatto.xpeciclodevida

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "$ACTIVITY onCreate")

        configurarListeners()
    }

    private fun configurarListeners() {
        configurarListenerBtnNovaActitivy()
    }

    private fun configurarListenerBtnNovaActitivy() {
        val button = findViewById<Button>(R.id.btnNovaTela)
        button.setOnClickListener() {
            startActivity(Intent(this, NovaActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "$ACTIVITY onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "$ACTIVITY onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "$ACTIVITY onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "$ACTIVITY onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "$ACTIVITY onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "$ACTIVITY onDestroy")
    }

    companion object {
        private const val TAG = "XPELog"
        private const val ACTIVITY = "MainActivity::"
    }
}