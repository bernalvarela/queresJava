package jcg.zheng.demo.api;

public interface StringInstrument extends MusicalInstrument {

	/**
	 * Play the song with a bow
	 * 
	 * @param song
	 */
	void bow(String song);

	/**
	 * Play the song by plucking
	 * 
	 * @param song
	 */
	void pluck(String song);

}
