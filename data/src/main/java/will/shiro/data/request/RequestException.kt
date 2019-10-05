package will.shiro.data.request

class RequestException private constructor(
    val errorCode: Int?,
    val errorMessage: String?,
    val throwable: Throwable?
) : Exception() {

    companion object {
        fun unexpectedError(throwable: Throwable): RequestException {
            throwable.printStackTrace()
            return RequestException(null, throwable.message, throwable)
        }
    }
}
