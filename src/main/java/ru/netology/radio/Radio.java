package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int countRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = minRadioStation + (countRadioStation - 1);
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int soundVolumeLevel;


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation || newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void setSoundVolumeLevel(int newSoundVolumeLevel) {
        if (newSoundVolumeLevel < minVolume || newSoundVolumeLevel > maxVolume) {
            return;
        }
        soundVolumeLevel = newSoundVolumeLevel;
    }

    public Radio(int countRadioStation){
        this.countRadioStation = countRadioStation;
    }


    public void nextStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation++;
        }

    }

    public void prevStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void increaseVolumeLevel() {
        if (soundVolumeLevel == maxVolume) {
            return;
        } else {
            soundVolumeLevel++;
        }
    }

    public void decreaseVolumeLevel() {
        if (soundVolumeLevel == minVolume) {
            return;
        } else {
            soundVolumeLevel--;
        }
    }

}
