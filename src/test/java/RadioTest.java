import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //тесты на выбор станции
    @Test
    public void shouldStation() {
        Radio station = new Radio();

        station.setCurrentStation(3);

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxStation() {
        Radio station = new Radio();

        station.setToMaxStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationAboveMax() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.setNextRadioStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNextNotMoreMaxStation(){
        Radio station= new Radio();
        station.setCurrentStation(7);

        station.setNextRadioStation();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        station.setPrevRadioStation();


        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNotMinStation(){
        Radio station= new Radio();
        station.setCurrentStation(2);

        station.setPrevRadioStation();

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    //тесты на громкость

    @Test
    public void choiceMaxVolume() {
        Radio volume = new Radio();

        volume.setMaxVolume();

        int expected = 100;
        int actual = volume.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxVolume() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(102);

        int expected = 100;
        int actual = volume.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMinVolume() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(-5);

        int expected = 0;
        int actual = volume.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

}
