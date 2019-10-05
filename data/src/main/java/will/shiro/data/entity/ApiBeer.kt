package will.shiro.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * How entities are mapped in the API (the majority of them uses snake_case)
 * It is also used for "map" the entities to one with an attribute or type different for the Android application
 *
 * */

data class ApiBeer(
    @SerializedName("name") val name: String?
) : Serializable {

//    object ApiBeerToBeer : will.shiro.data.mapper.Mapper<ApiBeer, Beer>() {
//        override fun transform(t: ApiBeer) = Beer(
//            name = t.name
//        )
//    }
}