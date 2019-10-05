package will.shiro.presentation.beer

import will.shiro.domain.entity.Beer

interface BeerDelegate {
    fun getBeer(onSuccess: (List<Beer>) -> Unit, onFailure: (Throwable) -> Unit)
}