package jcg.zheng.demo.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jcg.zheng.demo.api.BrassInstrument;

public class Tuba implements BrassInstrument {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void buzz(String song) {
	logger.info(instrumentName() + PLAY_MSG + song);
    }

    @Override
    public String demo() {
	return "Tuba overrides the default demo method";
    }

    @Override
    public String instrumentName() {
	return "Tuba";
    }

    @Override
    public void play(String song) {
	buzz(song);
    }

}
