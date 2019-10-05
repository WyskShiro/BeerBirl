package will.shiro.presentation.util.resources

import android.content.Context
import androidx.annotation.StringRes
import will.shiro.domain.util.StringsProvider
import will.shiro.presentation.R

// The class that actually access context and the strings
class AndroidStringProvider(context: Context) : StringsProvider {
    private val context = context.applicationContext

    override val beerTitle: String get() = res(R.string.beerbirl_title)

    private fun res(@StringRes stringId: Int) = context.getString(stringId)
}
