package will.shiro.presentation.util.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("setImage")
fun ImageView.setImage(imageUrl: String?) {
    imageUrl?.let {
        Glide
            .with(this)
            .load(it)
            .into(this)
    }
}