package will.shiro.data.repository

import io.reactivex.Single
import will.shiro.data.api.ApiClient
import will.shiro.data.entity.ApiBeer

//class DefaultBeerRepository(
//    private val apiClient: ApiClient
//) : BeerRepository {
//
//    override fun getBeers(): Single<Beer> =
//        apiClient.getBeers().map(ApiBeer.ApiBeerToBeer::transform)
//}