package will.shiro.presentation

import junit.framework.Assert.assertNotNull
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import will.shiro.domain.interactor.beer.GetBeer
import will.shiro.presentation.util.structure.dependecyinjector.*

class _2_CheckIfMappingObjectIsWorking: KoinTest {

    val getBeer by inject<GetBeer>()

    @BeforeEach
    fun before() {
        startKoin {
            modules(listOf(interactorModule, repositoryModule, applicationModule, viewModelModule, delegateModule))
        }
    }

    @Test
    fun checkIfMappingObjectIsWorking() {
        val beers = getBeer.execute().blockingGet()
        assertNotNull(beers)
        assertNotNull(beers[0].name)
        assertNotNull(beers[0].description)
        assertNotNull(beers[0].imageUrl)
    }

    @AfterEach
    fun after() {
        stopKoin()
    }
}
