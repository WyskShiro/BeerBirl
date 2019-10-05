package will.shiro.presentation.util.structure.base

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.tem.plate.util.structure.navigation.NavData
import com.tem.plate.util.structure.navigation.Navigator
import will.shiro.presentation.util.extensions.observeEvent
import will.shiro.presentation.util.extensions.shortToast

abstract class BaseActivity : AppCompatActivity() {

    abstract val baseViewModel: BaseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subscribeUi()
    }

    open fun subscribeUi() {
        with(baseViewModel) {
            goTo.observeEvent(this@BaseActivity, ::onNextNavigation)
            toast.observeEvent(this@BaseActivity, ::onNextToast)
        }
    }

    private fun onNextToast(text: String?) {
        text?.let {
            shortToast(it)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun onNextNavigation(navData: NavData?) {
        navData.let {
            Navigator.goTo(this, it)
        }
    }
}