package will.shiro.presentation.util.structure.dependecyinjector

import org.koin.dsl.module
import will.shiro.data.repository.DefaultBeerRepository
import will.shiro.domain.boundary.BeerRepository

val repositoryModule = module {
    factory<BeerRepository> { DefaultBeerRepository(get()) }
}