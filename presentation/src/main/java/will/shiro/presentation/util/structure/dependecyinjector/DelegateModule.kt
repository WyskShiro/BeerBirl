package will.shiro.presentation.util.structure.dependecyinjector

import org.koin.dsl.module
import will.shiro.presentation.beer.BeerDelegate
import will.shiro.presentation.beer.DefaultBeerDelegate

val delegateModule = module {
    factory<BeerDelegate> { DefaultBeerDelegate(get(), get()) }
}