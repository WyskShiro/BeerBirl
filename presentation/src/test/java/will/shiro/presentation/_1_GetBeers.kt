package will.shiro.presentation

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import will.shiro.domain.interactor.beer.GetBeer
import will.shiro.presentation.util.structure.dependecyinjector.*

class _1_GetBeers : KoinTest {

    val getBeer by inject<GetBeer>()

    @BeforeEach
    fun before() {
        startKoin {
            modules(listOf(interactorModule, repositoryModule, applicationModule, viewModelModule, delegateModule))
        }
    }

    @Test
    fun getBeers() {
        val beers = getBeer.execute().blockingGet()
        assertNotNull(beers)
    }

    @AfterEach
    fun after() {
        stopKoin()
    }
}
