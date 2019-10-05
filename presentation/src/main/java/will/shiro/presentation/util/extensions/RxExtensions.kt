package will.shiro.presentation.util.extensions

import com.tem.plate.util.resources.SchedulerProvider
import io.reactivex.Single

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