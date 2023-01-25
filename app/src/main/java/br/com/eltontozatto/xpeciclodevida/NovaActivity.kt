package br.com.eltontozatto.xpeciclodevida

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NovaActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova)
        button = findViewById(R.id.btnVoltar)
        if (savedInstanceState != null) {
            if (savedInstanceState.getBoolean(TAG_VIEW)) {
                button.visibility = View.VISIBLE
            }
        }
        Log.i(TAG, "${ACTIVITY}onCreate")
        configurarListeners()
    }

    private fun configurarListeners() {
        acaoBotaoVoltar()
        acaoBotaoExibir()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean(TAG_VIEW, button.visibility == View.VISIBLE)
    }

    private fun acaoBotaoExibir() {
        findViewById<Button>(R.id.btnExibir).setOnClickListener {
            button.visibility = View.VISIBLE
        }
    }

    private fun acaoBotaoVoltar() {
        button.setOnClickListener {
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "${ACTIVITY}onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "${ACTIVITY}onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "${ACTIVITY}onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "${ACTIVITY}onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "${ACTIVITY}onDestroy")
    }

    companion object {
        private const val TAG = "XPELog"
        private const val ACTIVITY = "NovaActivity::"
        private const val TAG_VIEW = "button_visibility"
    }
}