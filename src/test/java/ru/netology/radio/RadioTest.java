package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio service = new Radio(20);

    @Test
    void factCurrentRadioStation() {
        service.setCurrentRadioStation(5);

        int expected = 5;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factCurrentRadioStationTooBig() {
        service.setCurrentRadioStation(service.getMaxRadioStation() + 1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factCurrentRadioStationLessThanNormal() {
        service.setCurrentRadioStation(service.getMinRadioStation() - 1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void factSoundVolumeLevel() {
        service.setSoundVolumeLevel(10);

        int expected = 10;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factSoundVolumeLevelBig() {
        service.setSoundVolumeLevel(service.getMaxVolume());

        int expected = 100;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factSoundVolumeLevelTooBig() {
        service.setSoundVolumeLevel(service.getMaxVolume() + 1);

        int expected = 0;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factSoundVolumeLevelLessThanNormal() {
        service.setSoundVolumeLevel(service.getMinVolume() - 1);

        int expected = 0;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factSoundVolumeLevelMini() {
        service.setSoundVolumeLevel(service.getMinVolume());

        int expected = 0;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationMini() {
        service.setCurrentRadioStation(service.getMinRadioStation());

        service.nextStation();

        int expected = 1;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationNormal6() {
        service.setCurrentRadioStation(6);

        service.nextStation();

        int expected = 7;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationNormalMax() {
        service.setCurrentRadioStation(service.getMaxRadioStation() - 1);

        service.nextStation();

        int expected = service.getMaxRadioStation();
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationMax() {
        service.setCurrentRadioStation(service.getMaxRadioStation());

        service.nextStation();

        int expected = service.getMinRadioStation();
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationNormalMax() {
        service.setCurrentRadioStation(service.getMaxRadioStation());

        service.prevStation();

        int expected = service.getMaxRadioStation() - 1;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationNormal6() {
        service.setCurrentRadioStation(6);

        service.prevStation();

        int expected = 5;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationNormalMini() {
        service.setCurrentRadioStation(1);

        service.prevStation();

        int expected = service.getMinRadioStation();
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationMini() {
        service.setCurrentRadioStation(service.getMinRadioStation());

        service.prevStation();

        int expected = service.getMaxRadioStation();
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseTheSoundMax() {
        service.setSoundVolumeLevel(service.getMaxVolume());

        service.increaseVolumeLevel();

        int expected = service.getMaxVolume();
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseTheSoundNormal0() {
        service.setSoundVolumeLevel(service.getMinVolume());

        service.increaseVolumeLevel();

        int expected = 1;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseTheSoundNormalMax() {
        service.setSoundVolumeLevel(99);

        service.increaseVolumeLevel();

        int expected = service.getMaxVolume();
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseTheSoundNormal55() {
        service.setSoundVolumeLevel(55);

        service.increaseVolumeLevel();

        int expected = 56;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundReductionMini() {
        service.setSoundVolumeLevel(service.getMinVolume());

        service.decreaseVolumeLevel();

        int expected = service.getMinVolume();
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundReductionNormalMax() {
        service.setSoundVolumeLevel(service.getMaxVolume());

        service.decreaseVolumeLevel();

        int expected = 99;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundReductionNormalMini() {
        service.setSoundVolumeLevel(1);

        service.decreaseVolumeLevel();

        int expected = service.getMinVolume();
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundReductionNormal55() {
        service.setSoundVolumeLevel(55);

        service.decreaseVolumeLevel();

        int expected = 54;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void factCurrentRadioStationTooBigByDefault() {
        Radio service = new Radio();
        service.setCurrentRadioStation(service.getMaxRadioStation() + 1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void nextStationNormalMaxByDefault() {
        Radio service = new Radio();
        service.setCurrentRadioStation(service.getMaxRadioStation() - 1);

        service.nextStation();

        int expected = service.getMaxRadioStation();
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationMaxByDefault() {
        Radio service = new Radio();
        service.setCurrentRadioStation(service.getMaxRadioStation());

        service.nextStation();

        int expected = service.getMinRadioStation();
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void prevStationNormalMaxByDefault() {
        Radio service = new Radio();
        service.setCurrentRadioStation(service.getMaxRadioStation());

        service.prevStation();

        int expected = service.getMaxRadioStation() - 1;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationMiniByDefault() {
        Radio service = new Radio();
        service.setCurrentRadioStation(service.getMinRadioStation());

        service.prevStation();

        int expected = service.getMaxRadioStation();
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseTheSoundMaxByDefault() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(service.getMaxVolume());

        service.increaseVolumeLevel();

        int expected = service.getMaxVolume();
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }



}