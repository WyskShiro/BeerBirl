package will.shiro.liststests

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SimpleStringViewHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    fun set(item: String) {
        val itemText = view.findViewById<TextView>(R.id.item_text)
        itemText.text = item
    }

    companion object {
        fun inflate(view: View): SimpleStringViewHolder {
            return SimpleStringViewHolder(
                view
            )
        }
    }
}