package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(21);

    @Test
    void shouldCheckNumberOfStationsRadio1() {

        assertEquals(21, radio1.getNumberOfStations());
    }

    @Test
    void shouldCheckIfSetNumberOfStationsLessNine() {
        radio.setNumberOfStations(1);

        assertEquals(9, radio.getNumberOfStations());
    }

    @Test
    void shouldCheckIfSetNumberOfStationsAboveNine() {
        radio.setNumberOfStations(10);

        assertEquals(9, radio.getNumberOfStations());
    }

    @Test
    void shouldCheckIfSetNumberOfStationsIsNine() {
        radio.setNumberOfStations(9);

        assertEquals(9, radio.getNumberOfStations());
    }

    @Test
    void shouldCheckNextStationRadio1IfSerCurrentStationIsZero() {
        radio1.setCurrentStation(0);
        radio1.nextStation();

        assertEquals(1, radio1.getCurrentStation());
    }

    @Test
    void shouldCheckNextStationRadio1IfSerCurrentStationIsTwentyOne() {
        radio1.setCurrentStation(21);
        radio1.nextStation();

        assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    void shouldCheckNextStationIfSetCurrentStationAboveNine() {
        radio.setCurrentStation(10);
        radio.nextStation();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldCheckNextStationIfSetCurrentStationLessNine() {
        radio.setCurrentStation(8);
        radio.nextStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldCheckNextStationIfSetCurrentStationIsNine() {
        radio.setCurrentStation(9);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCheckPrevStationRadio1IfSetCurrentStationIsTwentyOne() {
        radio1.setCurrentStation(21);
        radio1.prevStation();

        assertEquals(20, radio1.getCurrentStation());
    }

    @Test
    void shouldCheckPrevStationRadio1IfSetCurrentStationIsZero() {
        radio1.setCurrentStation(0);
        radio1.prevStation();

        assertEquals(21, radio1.getCurrentStation());
    }

    @Test
    void shouldCheckPrevStationIfSetCurrentStationLessZero() {
        radio.setCurrentStation(-1);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldCheckPrevStationIfSetCurrentStationAboveZero() {
        radio.setCurrentStation(1);
        radio.prevStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCheckPrevStationIfSetCurrentStationIsZero() {
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldCheckIncreaseVolumeIfSetCurrentVolumeAboveOneHundred() {
        radio.setVolume(111);
        radio.increaseVolume();

        assertEquals(1, radio.getVolume());
    }

    @Test
    void shouldCheckIncreaseVolumeIfSetCurrentVolumeIsOneHundred() {
        radio.setVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldCheckDecreaseVolumeIfSetCurrentVolumeAboveZero() {
        radio.setVolume(100);
        radio.decreaseVolume();

        assertEquals(99, radio.getVolume());
    }

    @Test
    void shouldCheckDecreaseVolumeIfSetCurrentVolumeLessZero() {
        radio.setVolume(-1);
        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }

}