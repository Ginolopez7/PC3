package com.gino.pc3.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import com.gino.pc3.databinding.ItemShowPlatilloBinding;
import com.gino.pc3.model.Platillo;
import com.gino.pc3.model.Receta;
import com.gino.pc3.model.Shows;

import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;

public class RVPlatillosAdapter extends RecyclerView.Adapter<RVPlatillosAdapter.PlatillosVH> {

    private List<Shows> shows;

    public RVPlatillosAdapter(List<Shows> shows) {
        this.shows = shows;
    }

    @NonNull
    @Override
    public PlatillosVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemShowPlatilloBinding binding = ItemShowPlatilloBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new PlatillosVH(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PlatillosVH holder, int position) {
        holder.bind(shows.get(position));
    }

    @Override
    public int getItemCount() {
        return shows.size();
    }

    class PlatillosVH extends RecyclerView.ViewHolder {

        private ItemShowPlatilloBinding binding;
        public PlatillosVH(ItemShowPlatilloBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Shows show) {
            if (show instanceof Platillo) {
                binding.txtPrecio.setVisibility(View.GONE);
            } else if (show instanceof Receta) {
                binding.txtPrecio.setVisibility(View.VISIBLE);
                binding.txtPrecio.setText("Precio " + ((Receta) show).getPrecio());
            }
            binding.txtName.setText(show.getName());
            ImageLoader imageLoader = Coil.imageLoader(binding.getRoot().getContext());
            ImageRequest request = new ImageRequest.Builder(binding.getRoot().getContext())
                    .data(show.getImgUrl())
                    .crossfade(true)
                    .target(binding.imgShow)
                    .build();
            imageLoader.enqueue(request);
        }
    }
}
