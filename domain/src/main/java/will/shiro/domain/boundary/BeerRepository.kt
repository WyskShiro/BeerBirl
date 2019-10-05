package will.shiro.domain.boundary

import io.reactivex.Single
import will.shiro.domain.entity.Beer

interface BeerRepository {
    fun getBeers(): Single<List<Beer>>
}