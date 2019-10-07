package will.shiro.presentation.beer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import will.shiro.domain.entity.Beer
import will.shiro.presentation.databinding.BottomSheetBeerBinding

class BeerBottomSheet: BottomSheetDialogFragment() {

    private lateinit var binding: BottomSheetBeerBinding
    private val beer by lazy {
        arguments?.getSerializable(BEER_BUNDLE) as? Beer
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheetBeerBinding.inflate(inflater, container, false)
        setupUi()
        return binding.root
    }

    private fun setupUi() {
        binding.beer = beer
    }

    companion object {
        const val TAG = "BEER"
        const val BEER_BUNDLE = "BEER_BUNDLE"
    }
}