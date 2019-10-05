package will.shiro.domain.interactor.beer

import io.reactivex.Single
import will.shiro.domain.boundary.BeerRepository
import will.shiro.domain.entity.Beer

class GetBeer constructor(
    private val repository: BeerRepository
) {

    fun execute(): Single<List<Beer>> {
        return repository.getBeers()
    }
}
