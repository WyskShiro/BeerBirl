package will.shiro.presentation.beer

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import org.koin.android.ext.android.inject
import will.shiro.domain.entity.Beer
import will.shiro.presentation.R
import will.shiro.presentation.databinding.ActivityBeerBinding
import will.shiro.presentation.util.extensions.observe
import will.shiro.presentation.util.extensions.safeLet
import will.shiro.presentation.util.structure.base.BaseActivity
import will.shiro.presentation.util.structure.base.BaseViewModel

class BeerActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = viewModel

    private lateinit var binding: ActivityBeerBinding
    private val viewModel: BeerViewModel by inject()
    private var beerAdapter: BeerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_beer)
        lifecycle.addObserver(viewModel)
        setupUi()
        setupAdapter()
        setupRecyclerView()
        super.onCreate(savedInstanceState)
    }

    override fun subscribeUi() {
        super.subscribeUi()
        viewModel.beers.observe(this, ::onBeersReceived)
    }

    private fun setupUi() {
        // Set clicklisteners and textListeners
    }

    private fun setupAdapter() {
        beerAdapter = BeerAdapter()
    }

    private fun setupRecyclerView() {
        with(binding.recyclerViewBeer) {
            layoutManager = LinearLayoutManager(context)
            adapter = beerAdapter
        }
    }

    private fun onBeersReceived(beers: List<Beer>?) {
        safeLet(beers, beerAdapter) { beers, beerAdapter ->
            beerAdapter.setItems(beers)
        }
    }
}