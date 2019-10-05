package will.shiro.presentation.beer

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tem.plate.util.structure.base.BaseActivity
import com.tem.plate.util.structure.base.BaseViewModel
import org.koin.android.ext.android.inject
import will.shiro.presentation.R

class BeerActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = viewModel

    private lateinit var binding: ActivityFruitBinding
    private val viewModel: BeerViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fruit)
        lifecycle.addObserver(viewModel)
        setupUi()
        super.onCreate(savedInstanceState)
    }

    private fun setupUi() {
        // Set clicklisteners and textListeners
    }

    companion object {

        fun createIntent(context: Context): Intent {
            return Intent(context, BeerActivity::class.java)
        }
    }
}