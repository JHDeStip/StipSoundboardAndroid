package be.stip.soundboard.views;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.List;

import javax.inject.Inject;

import be.stip.soundboard.App;
import be.stip.soundboard.BR;
import be.stip.soundboard.R;
import be.stip.soundboard.databinding.ButtonsViewBinding;
import be.stip.soundboard.models.Sound;
import be.stip.soundboard.viewmodels.ButtonsViewModel;
import stannieman.mvvm.ViewBase;

public class ButtonsView extends ViewBase<ButtonsViewModel> {
    @Inject
    Context context;

    public ButtonsView() {
        App.getAppComponent().inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((ButtonsViewBinding) DataBindingUtil.setContentView(this, R.layout.buttons_view)).setViewModel(getViewModel());

        final FrameLayout buttonsGrid = (FrameLayout)findViewById(R.id.buttonsGrid);

        getViewModel().addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                switch(i) {
                    case BR.sounds:
                        createButtons(buttonsGrid, getViewModel().getSounds());
                        break;
                }
            }
        });
    }

    private void createButtons(FrameLayout buttonsGrid, List<Sound> sounds) {
        buttonsGrid.removeAllViews();

        int size = getWindowWidth() / 2;

        int nSounds = sounds.size();
        for (int i = 0; i < nSounds; i++) {
            int width;
            if (nSounds % 2 != 0 && i == nSounds - 1) {
                width = size * 2;
            }
            else {
                width = size;
            }

            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(width, size);
            params.leftMargin = (i%2)*size;
            params.topMargin = (i/2)*size;

            buttonsGrid.addView(createButton(sounds.get(i), width, size), params);
        }
    }

    private Button createButton(final Sound sound, int width, int height) {
        final Button button = new Button(context);
        button.setText(sound.getName());
        button.setSoundEffectsEnabled(false);
        button.setTextColor(Color.rgb(237, 28, 36));
        button.setBackground(ContextCompat.getDrawable(context, R.drawable.button_border_shape));
        button.setWidth(width);
        button.setMaxWidth(width);
        button.setHeight(height);
        button.setMaxHeight(height);
        button.setTransformationMethod(null);
        button.setTextSize(20);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getViewModel().playSound(sound);
            }
        });

        return button;
    }

    private int getWindowWidth() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }
}
