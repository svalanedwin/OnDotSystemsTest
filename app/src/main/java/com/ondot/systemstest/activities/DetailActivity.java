package com.ondot.systemstest.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.ondot.systemstest.R;
import com.ondot.systemstest.databinding.ActivityDetailsBinding;
import com.ondot.systemstest.models.PixabayImage;
import com.ondot.systemstest.viewmodels.PixabayImageViewModel;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailsBinding activityDetailsBinding;
    public final static String PIXABAY_IMAGE = "PIXABAY_IMAGE";
    private PixabayImage image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_details);
        initImage();
        activityDetailsBinding.setViewmodel(new PixabayImageViewModel(image));
    }

    private void initImage() {
        image = new Gson().fromJson(getIntent().getStringExtra(PIXABAY_IMAGE), PixabayImage.class);
    }
}
