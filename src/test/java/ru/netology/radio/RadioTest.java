package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void factCurrentRadioStation() {
        Radio service = new Radio();
        service.setCurrentRadioStation(5);

        int expected = 5;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factCurrentRadioStationTooBig() {
        Radio service = new Radio();
        service.setCurrentRadioStation(10);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factCurrentRadioStationLessThanNormal() {
        Radio service = new Radio();
        service.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void factSoundVolumeLevel() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(10);

        int expected = 10;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factSoundVolumeLevelBig() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(100);

        int expected = 100;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factSoundVolumeLevelTooBig() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(101);

        int expected = 0;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factSoundVolumeLevelLessThanNormal() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(-1);

        int expected = 0;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factSoundVolumeLevelMini() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(0);

        int expected = 0;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationNormal1() {
        Radio service = new Radio();
        service.setCurrentRadioStation(0);

        service.nextStation();

        int expected = 1;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationNormal8() {
        Radio service = new Radio();
        service.setCurrentRadioStation(8);

        service.nextStation();

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationMax() {
        Radio service = new Radio();
        service.setCurrentRadioStation(9);

        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationNormal9() {
        Radio service = new Radio();
        service.setCurrentRadioStation(9);

        service.prevStation();

        int expected = 8;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationNormal1() {
        Radio service = new Radio();
        service.setCurrentRadioStation(1);

        service.prevStation();

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationMini() {
        Radio service = new Radio();
        service.setCurrentRadioStation(0);

        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseTheSoundMax() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(100);

        service.increaseVolumeLevel();

        int expected = 100;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseTheSoundNormal0() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(0);

        service.increaseVolumeLevel();

        int expected = 1;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseTheSoundNormal99() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(99);

        service.increaseVolumeLevel();

        int expected = 100;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundReductionMini() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(0);

        service.decreaseVolumeLevel();

        int expected = 0;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundReductionNormal100() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(100);

        service.decreaseVolumeLevel();

        int expected = 99;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundReductionNormal1() {
        Radio service = new Radio();
        service.setSoundVolumeLevel(1);

        service.decreaseVolumeLevel();

        int expected = 0;
        int actual = service.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }


}