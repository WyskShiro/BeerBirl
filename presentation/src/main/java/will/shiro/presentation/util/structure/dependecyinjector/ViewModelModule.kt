package will.shiro.presentation.util.structure.dependecyinjector

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import will.shiro.presentation.beer.BeerViewModel
import will.shiro.presentation.util.structure.base.BaseViewModel

val viewModelModule = module {
    viewModel { BaseViewModel() }
    viewModel { BeerViewModel(get()) }
}