package will.shiro.presentation.util.structure.base

import androidx.lifecycle.*
import com.tem.plate.util.structure.navigation.NavData
import io.reactivex.disposables.CompositeDisposable
import org.koin.core.KoinComponent
import org.koin.core.inject
import will.shiro.presentation.util.ErrorHandler
import will.shiro.presentation.util.structure.arch.Event
import will.shiro.presentation.util.viewmodels.Placeholder

open class BaseViewModel : LifecycleObserver, KoinComponent, ViewModel() {
    val goTo: LiveData<Event<NavData>> get() = goToLiveData
    val toast: LiveData<Event<String>> get() = toastLiveData
    val placeholder: LiveData<Placeholder> get() = placeholderLiveData

    private val goToLiveData = MutableLiveData<Event<NavData>>()
    private val placeholderLiveData = MutableLiveData<Placeholder>()
    private val toastLiveData = MutableLiveData<Event<String>>()
    private val errorHandler: ErrorHandler by inject()

    protected val disposables: CompositeDisposable = CompositeDisposable()

    fun setPlaceholder(placeholder: Placeholder) {
        placeholderLiveData.postValue(placeholder)
    }

    fun setToast(message: String) {
        toastLiveData.postValue(Event(message))
    }

    fun goTo(navData: NavData) {
        goToLiveData.postValue(Event(navData))
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private fun onDestroy() {
        disposables.dispose()
    }
}