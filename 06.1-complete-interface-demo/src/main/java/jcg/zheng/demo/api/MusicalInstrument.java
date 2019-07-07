package jcg.zheng.demo.api;

import java.util.Random;

/**
 * 
 * Interface defines "contracts"
 * 
 * JDK 8
 * 
 * 1) add Default interface method to preserve backward compatibility when
 * modifying an interface by adding new methods when the interface has more than
 * one implementations. Adding new methods will force all the implementation to
 * implement these new methods. With Default interface method solve this issue.
 * 2) add static method
 * 
 * JDK 9 add private method
 *
 */
public interface MusicalInstrument {

    static String PLAY_MSG = " plays : ";

    private static boolean isBroke() {
	boolean isBroke = false;
	Random ran = new Random();

	int nxt = ran.nextInt();
	if (nxt % 8 == 0) {
	    isBroke = true;
	}
	return isBroke;
    }

    /**
     * repair the instrument
     * 
     * @param isBroke
     * @return a message show the repair result;
     */
    public static String repair() {
	if (isBroke()) {
	    return "Fixed";
	}

	return "In good condition";
    }

    /**
     * Play demo song
     * 
     * @return
     */
    default String demo() {
	return instrumentName() + playMsg();
    }

    /**
     * Return the musical instrument name
     * 
     * @return the musical instrument name
     */
    String instrumentName();

    /**
     * Play the given song
     * 
     * @param song the song to play
     */
    void play(String song);

    private String playMsg() {
	return " plays a demo song";
    }
}
