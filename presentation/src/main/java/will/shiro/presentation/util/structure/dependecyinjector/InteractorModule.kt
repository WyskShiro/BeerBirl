package will.shiro.presentation.util.structure.dependecyinjector

import org.koin.dsl.module
import will.shiro.domain.interactor.beer.GetBeer

val interactorModule = module {
    single { GetBeer(get()) }
}