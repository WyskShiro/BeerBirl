package will.shiro.data.entity

import com.google.gson.annotations.SerializedName
import will.shiro.data.mapper.Mapper
import will.shiro.domain.entity.Beer
import java.io.Serializable

/**
 * How entities are mapped in the API (the majority of them uses snake_case)
 * It is also used for "map" the entities to one with an attribute or type different for the Android application
 *
 * */

data class ApiBeer(
    @SerializedName("name") val name: String?,
    @SerializedName("image_url") val imageUrl: String?,
    @SerializedName("description") val description: String?
) : Serializable {

    object ApiBeerToBeer : Mapper<ApiBeer, Beer>() {
        override fun transform(t: ApiBeer) = Beer(
            name = t.name,
            imageUrl = t.imageUrl,
            description = t.description
        )
    }
}