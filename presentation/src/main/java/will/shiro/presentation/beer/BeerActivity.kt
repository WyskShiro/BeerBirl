package will.shiro.presentation.beer

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.koin.android.ext.android.inject
import will.shiro.presentation.R
import will.shiro.presentation.databinding.ActivityBeerBinding
import will.shiro.presentation.util.structure.base.BaseActivity
import will.shiro.presentation.util.structure.base.BaseViewModel

class BeerActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = viewModel

    private lateinit var binding: ActivityBeerBinding
    private val viewModel: BeerViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_beer)
        lifecycle.addObserver(viewModel)
        setupUi()
        super.onCreate(savedInstanceState)
    }

    private fun setupUi() {
        // Set clicklisteners and textListeners
    }
}