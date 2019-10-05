package will.shiro.data.repository

import io.reactivex.Single
import will.shiro.data.api.ApiClient
import will.shiro.data.entity.ApiBeer
import will.shiro.domain.boundary.BeerRepository
import will.shiro.domain.entity.Beer

class DefaultBeerRepository(
    private val apiClient: ApiClient
) : BeerRepository {

    override fun getBeers(): Single<List<Beer>> =
        apiClient.getBeers().map(ApiBeer.ApiBeerToBeer::transformList)
}