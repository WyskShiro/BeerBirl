package com.example.blog.model

data class Curso(
        val id: Long?,
        val name: String?,
        val category: String? = ""
) {

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        val x = id?.let { 0 } ?: id.hashCode()
        result = (prime * result).plus(x)
        return result
    }

    override fun equals(obj: Any?): Boolean {
//        if (this == obj)
//            return true
        if (obj == null)
            return false
        if (this::javaClass != obj::javaClass)
            return false
        val other = obj as Curso
        if (id == null) {
            if (other.id != null)
                return false
        } else if (!id.equals(other.id))
            return false
        return true
    }
}