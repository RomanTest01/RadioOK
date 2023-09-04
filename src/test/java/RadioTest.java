import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
<<<<<<< HEAD
    Radio station = new Radio(9);
    Radio volume = new Radio();

    @Test
    public void test() {
=======
    Radio station = new Radio();
    Radio volume = new Radio(0, 100);

    @Test
    public void test() {
        Radio station = new Radio(20);
        station.setCurrentStation(15);

        int exepted = 15;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(exepted, actual);
>>>>>>> flexible

    }

    @Test
    public void testStations() {
        station.setCurrentStation(8);

        int expexted = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expexted, actual);

    }


    @Test
    public void testStation() {


        Assertions.assertEquals(9, station.getLastRadioStation());
    }

    @Test
    public void shouldStation() {


        station.setCurrentStation(3);

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxStation() {


        station.setToMaxStation();

        int expected = 9;
        int actual = station.getLastRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationAboveMax() {


        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {

        station.setCurrentStation(9);

        station.setNextRadioStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNextNotMoreMaxStation() {

        station.setCurrentStation(7);

        station.setNextRadioStation();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {

        station.setCurrentStation(-1);

        station.setPrevRadioStation();


        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNotMinStation() {

        station.setCurrentStation(2);

        station.setPrevRadioStation();

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    //тесты на громкость

    @Test
    public void shouldVolume() {


        station.setIncreaseVolume(15);

        int expected = 15;
        int actual = station.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceMaxVolume() {


        volume.setMaxVolume();

        int expected = 100;
        int actual = volume.getMaxVoidRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxVolume() {


        volume.setIncreaseVolume(102);

        int expected = 100;
        int actual = volume.getMaxVoidRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMinVolume() {


        volume.setIncreaseVolume(-5);

        int expected = 0;
        int actual = volume.getMinVoidRadio();

        Assertions.assertEquals(expected, actual);
    }


}
