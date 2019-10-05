package will.shiro.presentation.beer

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import will.shiro.domain.entity.Beer
import will.shiro.presentation.util.structure.base.BaseViewModel

class BeerViewModel(
    beerDelegate: BeerDelegate
) : BaseViewModel(),
        BeerDelegate by beerDelegate {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun onCreate() {
        getBeer(::getBeerOnSuccess, ::onFailure)
    }

    private fun getBeerOnSuccess(beers: List<Beer>) {
        val TODO = beers
        // TODO send information to activity
    }

    private fun onFailure(throwable: Throwable) {

        val TODO = throwable
    }
}