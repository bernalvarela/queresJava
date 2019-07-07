package jcg.zheng.demo.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jcg.zheng.demo.api.PercussionInstrument;

public class Drum implements PercussionInstrument {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void hit(String song) {
		logger.info(instrumentName() + PLAY_MSG + song);
	}

	@Override
	public String instrumentName() {
		return "Drum";
	}

	@Override
	public void play(String song) {
		hit(song);
	}

	@Override
	public void shake(String song) {
		throw new UnsupportedOperationException();
	}

}
