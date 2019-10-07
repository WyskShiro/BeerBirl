package will.shiro.domain.entity

import java.io.Serializable

data class Beer(
    var name: String?,
    var imageUrl: String?,
    var description: String?
) : Serializable
