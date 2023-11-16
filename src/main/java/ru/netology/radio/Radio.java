package ru.netology.radio;

public class Radio {

    int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0 || newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    int soundVolumeLevel;

    public int getSoundVolumeLevel() {
        return soundVolumeLevel;
    }

    public void setSoundVolumeLevel(int newSoundVolumeLevel) {
        if (newSoundVolumeLevel < 0 || newSoundVolumeLevel > 100) {
            return;
        }
        soundVolumeLevel = newSoundVolumeLevel;
    }

    public void nextStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }

    }

    public void prevStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
        }
    }

    public void increaseVolumeLevel() {
        if (soundVolumeLevel == 100) {
            return;
        } else {
            soundVolumeLevel++;
        }
    }

    public void decreaseVolumeLevel() {
        if (soundVolumeLevel == 0) {
            return;
        } else {
            soundVolumeLevel--;
        }
    }

}
