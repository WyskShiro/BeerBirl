package will.shiro.presentation.beer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import will.shiro.domain.entity.Beer
import will.shiro.presentation.databinding.ItemListBeerBinding

class BeerViewHolder(
    private val binding: ItemListBeerBinding,
    private val onBeerClicked: (Beer) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(beer: Beer) {
        binding.beer = beer
        binding.root.setOnClickListener {
            onBeerClicked.invoke(beer)
        }
    }

    companion object {
        fun inflate(parent: ViewGroup, onBeerClicked: (Beer) -> Unit): BeerViewHolder {
            return BeerViewHolder(
                ItemListBeerBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ),
                onBeerClicked
            )
        }
    }
}