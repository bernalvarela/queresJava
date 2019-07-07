package jcg.zheng.demo.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jcg.zheng.demo.api.PercussionInstrument;

public class Bell implements PercussionInstrument {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void hit(String song) {
		logger.info(instrumentName() + PLAY_MSG + song);
	}

	@Override
	public String instrumentName() {
		return "Bell";
	}

	@Override
	public void play(String song) {
		shake(song);
	}

	@Override
	public void shake(String song) {
		logger.info(instrumentName() + PLAY_MSG + song);
	}

}
