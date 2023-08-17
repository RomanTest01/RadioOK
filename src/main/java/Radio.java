public class Radio {

    private int currentStation;
    private int increaseVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setCurrentStation(int newCurrentStation) {  //выбор станции
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }


        currentStation = newCurrentStation;
    }

    public void setNextRadioStation() {   //переключение станции вперед
        int next = currentStation + 1;

        currentStation = next;
        if (currentStation > 9) {
            currentStation = 0;
        }

    }

    public void setPrevRadioStation() {  //переключение станции назад
        int prev = currentStation - 1;

        currentStation = prev;
        if (currentStation < 0) {
            currentStation = 9;
        }
    }

    public void setToMaxStation() {
        currentStation = 9;
    }





    public void setIncreaseVolume(int newIncreaseVolume) {  //выбор громкости
        if (newIncreaseVolume > 100) {
            newIncreaseVolume = 100;
        }
        if (newIncreaseVolume < 0) {
            newIncreaseVolume = 0;
        }


        increaseVolume = newIncreaseVolume;
    }

    public void setMaxVolume() {
        increaseVolume = 100;
    }

}