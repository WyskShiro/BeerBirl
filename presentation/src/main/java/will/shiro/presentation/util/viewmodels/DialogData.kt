package will.shiro.presentation.util.viewmodels

class DialogData(
    val title: String,
    val message: String,
    val confirmButtonText: String? = null,
    val onConfirm: (() -> Unit)? = null,
    val dismissButtonText: String? = null,
    val onDismiss: (() -> Unit)? = null,
    val cancelable: Boolean? = true
) {
    companion object {

        fun confirm(
            title: String,
            message: String,
            onConfirm: () -> Unit,
            confirmButtonText: String? = null,
            cancelable: Boolean? = true
        ): DialogData {
            return DialogData(title, message, confirmButtonText, onConfirm, null, null, cancelable)
        }

        fun dismiss(
            title: String,
            message: String,
            onDismiss: () -> Unit,
            dismissButtonText: String? = null,
            cancelable: Boolean? = true
        ): DialogData {
            return DialogData(title, message, null, null, dismissButtonText, onDismiss, cancelable)
        }
    }
}
