package will.shiro.presentation.beer

import io.reactivex.disposables.CompositeDisposable
import will.shiro.domain.entity.Beer
import will.shiro.domain.interactor.beer.GetBeer
import will.shiro.presentation.util.extensions.defaultSched
import will.shiro.presentation.util.resources.SchedulerProvider

class DefaultBeerDelegate(
    private val getBeer: GetBeer,
    private val schedulerProvider: SchedulerProvider
) : BeerDelegate {

    private val disposables = CompositeDisposable()

    override fun getBeer(onSuccess: (List<Beer>) -> Unit, onFailure: (Throwable) -> Unit) {
        getBeer
            .execute()
            .defaultSched(schedulerProvider)
            .subscribe(onSuccess, onFailure)
            .let(disposables::add)
    }
}