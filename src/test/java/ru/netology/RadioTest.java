package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldCheckNextStationIfSetCurrentStationAboveNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckNextStationIfSetCurrentStationLessNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckNextStationIfSetCurrentStationIsNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckPrevStationIfSetCurrentStationLessZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckPrevStationIfSetCurrentStationAboveZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckPrevStationIfSetCurrentStationIsZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckIncreaseVolumeIfSetCurrentVolumeAboveTen() {
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckIncreaseVolumeIfSetCurrentVolumeIsTen() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckDecreaseVolumeIfSetCurrentVolumeAboveZero() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckDecreaseVolumeIfSetCurrentVolumeLessZero() {
        Radio radio = new Radio();
        radio.setVolume (-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }
}