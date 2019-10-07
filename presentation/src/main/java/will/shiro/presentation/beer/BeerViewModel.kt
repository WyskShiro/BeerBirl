package will.shiro.presentation.beer

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.OnLifecycleEvent
import will.shiro.domain.entity.Beer
import will.shiro.presentation.util.structure.base.BaseViewModel

class BeerViewModel(
    beerDelegate: BeerDelegate
) : BaseViewModel(),
    BeerDelegate by beerDelegate {

    val beers: LiveData<List<Beer>> get() = _beers

    private val _beers: MutableLiveData<List<Beer>> = MutableLiveData()


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun onCreate() {
        getBeer(::getBeerOnSuccess, {})
    }

    private fun getBeerOnSuccess(beers: List<Beer>) {
        _beers.value = beers
    }
}