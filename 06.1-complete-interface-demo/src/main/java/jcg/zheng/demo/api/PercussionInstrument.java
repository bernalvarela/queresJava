package jcg.zheng.demo.api;

public interface PercussionInstrument extends MusicalInstrument, ChildrenToy {

    /**
     * use the MusicalInstrument demo sine both interface has demo
     */
    @Override
    default String demo() {
	return MusicalInstrument.super.demo();
    }

    /**
     * Play the song by hitting
     * 
     * @param song
     */
    void hit(String song);

    /**
     * Play the song by shaking
     * 
     * @param song
     */
    void shake(String song);

}
