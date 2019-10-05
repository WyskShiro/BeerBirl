package will.shiro.presentation.util

import will.shiro.presentation.util.viewmodels.Placeholder

class ErrorHandler {

    private fun getUnknownErrorPlaceholder(): Placeholder {
        return Placeholder.Message("Sorry, something went wrong")
    }
}
