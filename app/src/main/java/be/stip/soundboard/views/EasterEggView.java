package be.stip.soundboard.views;

import android.os.Bundle;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import be.stip.soundboard.App;
import be.stip.soundboard.R;
import be.stip.soundboard.databinding.EasterEggViewBinding;
import be.stip.soundboard.viewmodels.EasterEggViewModel;
import stannieman.mvvm.ViewBase;

public class EasterEggView extends ViewBase<EasterEggViewModel> {

    public EasterEggView() {
        App.getAppComponent().inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);

        ((EasterEggViewBinding) DataBindingUtil.setContentView(this, R.layout.easter_egg_view)).setViewModel(getViewModel());
    }
}
