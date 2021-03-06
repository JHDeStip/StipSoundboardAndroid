package be.stip.soundboard.viewmodels;

import androidx.databinding.Bindable;

import java.util.List;

import javax.inject.Inject;

import be.stip.soundboard.BR;
import be.stip.soundboard.helpers.ISoundHelper;
import be.stip.soundboard.models.Sound;
import be.stip.soundboard.services.ISoundPlayService;
import stannieman.mvvm.ViewModelBase;
import stannieman.mvvm.navigation.INavigationService;

public class ButtonsViewModel extends ViewModelBase {
    @Inject
    ISoundHelper soundHelper;
    @Inject
    ISoundPlayService soundPlayService;
    @Inject
    INavigationService navigationService;

    private List<Sound> sounds;
    private String buttonsClicked = "";

    @Bindable
    public List<Sound> getSounds(){
        return sounds;
    }

    public void setSounds(List<Sound> sounds){
        if (this.sounds != sounds){
            this.sounds = sounds;
            notifyPropertyChanged(BR.sounds);
        }
    }

    @Inject
    public ButtonsViewModel() {}

    @Override
    protected void onFirstStart() {
        setSounds(soundHelper.getSounds());
    }

    public void playSound(Sound sound) {
        soundPlayService.playSoundAsync(sound.getFileName(), null);
    }
}
