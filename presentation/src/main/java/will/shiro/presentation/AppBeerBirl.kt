package will.shiro.presentation

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import will.shiro.presentation.util.structure.dependecyinjector.applicationModule
import will.shiro.presentation.util.structure.dependecyinjector.interactorModule
import will.shiro.presentation.util.structure.dependecyinjector.repositoryModule
import will.shiro.presentation.util.structure.dependecyinjector.viewModelModule

class AppBeerBirl : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@AppBeerBirl)
            modules(listOf(interactorModule, repositoryModule, applicationModule, viewModelModule))
        }
    }
}
