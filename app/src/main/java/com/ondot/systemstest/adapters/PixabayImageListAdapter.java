package com.ondot.systemstest.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ondot.systemstest.R;
import com.ondot.systemstest.databinding.PixabayImageItemBinding;
import com.ondot.systemstest.models.PixabayImage;
import com.ondot.systemstest.viewmodels.PixabayImageViewModel;

import java.util.List;

public class PixabayImageListAdapter extends RecyclerView.Adapter<PixabayImageListAdapter.PixabayImageViewHolder> {

    private List<PixabayImage> pixabayImageList;

    public PixabayImageListAdapter(List<PixabayImage> pixabayImageList) {
        this.pixabayImageList = pixabayImageList;
    }

    @Override
    public PixabayImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PixabayImageListAdapter.PixabayImageViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pixabay_image_item, parent, false));
    }

    @Override
    public void onBindViewHolder(PixabayImageViewHolder holder, int position) {
        holder.pixabayImageItemBinding.setViewmodel(new PixabayImageViewModel(pixabayImageList.get(position)));
    }

    @Override
    public int getItemCount() {
        return pixabayImageList.size();
    }

    public static class PixabayImageViewHolder extends RecyclerView.ViewHolder {

        public final PixabayImageItemBinding pixabayImageItemBinding;

        public PixabayImageViewHolder(View v) {
            super(v);
            pixabayImageItemBinding = PixabayImageItemBinding.bind(v);
        }
    }

}
