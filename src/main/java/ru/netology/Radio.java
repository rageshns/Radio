package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {

    private int currentStation;
    private int volume;
    private int numberOfStations = 9;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        if (numberOfStations  > 9) {
            return;
        }
        if (numberOfStations < 9) {
            return;
        }
        this.numberOfStations = numberOfStations;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > numberOfStations) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < numberOfStations) {
            currentStation = currentStation + 1;
        }
        else  {
                currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        else {
                currentStation = numberOfStations;
        }
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
