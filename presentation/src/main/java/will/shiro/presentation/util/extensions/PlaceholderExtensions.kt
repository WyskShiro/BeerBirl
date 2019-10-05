package will.shiro.presentation.util.extensions

import io.reactivex.Single
import will.shiro.presentation.util.viewmodels.Placeholder

fun <T> Single<T>.defaultPlaceholders(placeholderPlacerAction: (Placeholder) -> (Unit)): Single<T> {
    return this.defaultConsumers(
        { placeholderPlacerAction(Placeholder.Loading()) },
        { placeholderPlacerAction(Placeholder.HideAll) })
}
