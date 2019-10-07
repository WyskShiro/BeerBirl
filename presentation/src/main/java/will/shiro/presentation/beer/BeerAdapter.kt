package will.shiro.presentation.beer

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import will.shiro.domain.entity.Beer

class BeerAdapter(val onBeerClicked: (Beer) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val beerList: MutableList<Beer> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BeerViewHolder.inflate(parent, onBeerClicked)
    }

    override fun getItemCount() = beerList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as? BeerViewHolder)?.bind(beerList[position])
    }

    fun setItems(newBeers: List<Beer>) {
        beerList.clear()
        beerList.addAll(newBeers)
        notifyDataSetChanged()
    }
}