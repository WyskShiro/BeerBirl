package will.shiro.presentation.util.structure.dependecyinjector

import org.koin.android.logger.AndroidLogger
import org.koin.dsl.bind
import org.koin.dsl.module
import will.shiro.data.api.ApiClient
import will.shiro.domain.util.StringsProvider
import will.shiro.presentation.util.ErrorHandler
import will.shiro.presentation.util.resources.AndroidStringProvider
import will.shiro.presentation.util.resources.SchedulerProvider
import java.util.logging.Logger

val applicationModule = module {
    factory<StringsProvider> { AndroidStringProvider(get()) }
    factory { SchedulerProvider() }
    factory { AndroidLogger(get()) } bind Logger::class
    factory { ErrorHandler() }
    factory { ApiClient }
}