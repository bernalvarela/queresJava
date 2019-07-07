package jcg.zheng.demo.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jcg.zheng.demo.api.StringInstrument;

public class Violin implements StringInstrument {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void bow(String song) {
		logger.info(instrumentName() + PLAY_MSG + song);
	}

	@Override
	public String instrumentName() {
		return "Violin";
	}

	@Override
	public void play(String song) {
		bow(song);
	}

	@Override
	public void pluck(String song) {
		throw new UnsupportedOperationException();
	}

}
