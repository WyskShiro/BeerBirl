package will.shiro.presentation.util.extensions

import io.reactivex.Single
import will.shiro.presentation.util.resources.SchedulerProvider

fun <T> Single<T>.defaultSched(schedulerProvider: SchedulerProvider): Single<T> {
    return this.subscribeOn(schedulerProvider.io()).observeOn(schedulerProvider.main())
}

fun <T> Single<T>.defaultConsumers(
    onSubscribeCallback: () -> (Unit),
    doAfterTerminatecallback: () -> (Unit)
): Single<T> {
    return this.doOnSubscribe { onSubscribeCallback.invoke() }
        .doAfterTerminate({ doAfterTerminatecallback.invoke() })
}