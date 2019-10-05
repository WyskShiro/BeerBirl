package will.shiro.data.api

import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import will.shiro.data.entity.ApiBeer

/**
 * Declare urls for API
 */
interface ApiService {

    /**
     * Beers
     * */

    @GET("beers")
    fun getBeers(): Single<Response<List<ApiBeer>>>
}
