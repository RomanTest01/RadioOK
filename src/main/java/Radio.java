public class Radio {

    private int lastRadioStation = 9;
    private int currentStation;
    private int increaseVolume;
    private int maxVoidRadio = 100;

    private int minVoidRadio = 0;


    public Radio(int lastRadioStation) {
        this.lastRadioStation = lastRadioStation;

    }

    public Radio(int minVoidRadio, int maxVoidRadio) {
        this.minVoidRadio = minVoidRadio;
        this.maxVoidRadio = maxVoidRadio;
    }


    public int getCurrentStation() {

        return currentStation;
    }


    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public int getMaxVoidRadio() {
        return maxVoidRadio;
    }

    public int getMinVoidRadio() {
        return minVoidRadio;
    }

    public void setCurrentStation(int newCurrentStation) {  //выбор станции
        if (newCurrentStation > lastRadioStation) {
            newCurrentStation = 0;
        }


        currentStation = newCurrentStation;
    }

    public void setNextRadioStation() {   //переключение станции вперед
        int next = currentStation + 1;

        currentStation = next;
        if (currentStation > lastRadioStation) {
            currentStation = 0;
        }

    }

    public void setPrevRadioStation() {  //переключение станции назад
        int prev = currentStation - 1;

        currentStation = prev;
        if (currentStation < 0) {
            currentStation = lastRadioStation;
        }
    }

    public void setToMaxStation() {
        currentStation = lastRadioStation;
    }


    public void setIncreaseVolume(int newIncreaseVolume) {  //выбор громкости
        if (newIncreaseVolume > maxVoidRadio) {
            newIncreaseVolume = maxVoidRadio;
        }
        if (newIncreaseVolume < minVoidRadio) {
            newIncreaseVolume = minVoidRadio;
        }


        increaseVolume = newIncreaseVolume;
    }

    public void setMaxVolume() {
        increaseVolume = maxVoidRadio;
    }


}