package exercises.technology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Program {

    @Test
    public void computerIsRecentReturnsTrue(){
        Computer LK = new Computer("2","Work Computer", 2018);
        assertTrue(LK.computerIsRecent());
    }

    @Test
    public void computerIsRecentReturnsFalse(){
        Computer LK = new Computer("3","Work Computer", 2010);
        assertFalse(LK.computerIsRecent());
    }

    @Test
    public void computerStatusReturnsEqual(){
        Computer LK = new Computer("3","Work Computer",2018);
        String msg = "Work Computer was released on 2018 and is recent.";
        assertEquals(LK.computerStatus(), msg );
    }

    @Test
    public void laptopRamIsOutdatedReturnsFalse(){
        Laptop alien = new Laptop ("3","Alien", 2016, "Alienware", 10);
        assertFalse(alien.ramIsOutdated());
    }

    @Test
    public void laptopRamIsOutdatedReturnsTrue(){
        Laptop alien = new Laptop ("5","Alien", 2010, "Alienware", 4);
        assertTrue(alien.ramIsOutdated());
    }

    @Test
    public void laptopMessageEquals(){
        Laptop alien = new Laptop ("5","Alien", 2010, "Alienware", 4);
        assertEquals("Alien was released on 2010 and Ram wise needs an upgrade.", alien.computerStatus());
    }

    @Test
    public void smartphoneAndroidMessage(){
        SmartPhone pixel = new SmartPhone("9","Eric's phone", 2018, "Google Pixel", "Android");
        assertEquals("is better than iphone", pixel.operativeSystemMessage());
    }

    @Test
    public void smartphoneOtherPhoneMessage(){
        SmartPhone pixel = new SmartPhone("10","Eric's phone", 2018, "Razer", "Microsoft");
        assertEquals("is alright", pixel.operativeSystemMessage());
    }

    @Test
    public void smartphoneFullMessage(){
        SmartPhone pixel = new SmartPhone("15","Eric's phone", 2018, "Google Pixel", "Android");
        assertEquals("Your 2018 Android Google Pixel phone is better than iphone", pixel.phoneDescription());
    }

}
