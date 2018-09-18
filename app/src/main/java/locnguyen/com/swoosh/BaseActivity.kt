package locnguyen.com.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        d(TAG, "${javaClass.simpleName} + OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        d(TAG, "${javaClass.simpleName} + OnStart")
        super.onStart()
    }

    override fun onResume() {
        d(TAG,"${javaClass.simpleName} + OnResume")
        super.onResume()
    }

    override fun onPause() {
        d(TAG, "${javaClass.simpleName} + OnPause")
        super.onPause()
    }

    override fun onStop() {
        d(TAG, "${javaClass.simpleName} + OnStop")
        super.onStop()
    }

    override fun onRestart() {
        d(TAG, "${javaClass.simpleName} + OnRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        d(TAG, "${javaClass.simpleName} + OnDestroy")
        super.onDestroy()
    }



}
