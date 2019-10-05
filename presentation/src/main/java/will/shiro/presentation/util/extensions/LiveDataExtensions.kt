package will.shiro.presentation.util.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import will.shiro.presentation.util.structure.arch.Event
import will.shiro.presentation.util.structure.arch.EventObserver

fun <T> LiveData<T>.observe(owner: LifecycleOwner, observer: (T?) -> Unit) {
    observe(owner, androidx.lifecycle.Observer { observer(it) })
}

fun <T> LiveData<Event<T>>.observeEvent(owner: LifecycleOwner, observer: (T?) -> Unit) {
    observe(owner, EventObserver(observer))
}