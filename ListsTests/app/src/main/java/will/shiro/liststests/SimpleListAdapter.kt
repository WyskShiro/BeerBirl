package will.shiro.liststests

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter

class ListAdapter : ListAdapter<String, ListViewHolder>(StringDiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}