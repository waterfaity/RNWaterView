package com.waterfairy.waterview;

import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

/**
 * @author water_fairy / xuchangwei
 * @email 995637517@qq.com / xuchangwei@dreame.tech
 * @date: 2021/3/2
 * @info:
 */
public class RNWaterView extends SimpleViewManager<ImageView> {
    @NonNull
    @Override
    public String getName() {
        return "RNWaterView";
    }

    @NonNull
    @Override
    protected ImageView createViewInstance(@NonNull ThemedReactContext reactContext) {
        return new ImageView(reactContext);
    }

    @ReactProp(name = "url")
    public void setUrl(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }
}
