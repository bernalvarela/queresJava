package jcg.zheng.demo.api;

public interface BrassInstrument extends MusicalInstrument {
    /**
     * Make a buzz sound for the given song
     * 
     * @param song the given song
     */
    void buzz(String song);
}
