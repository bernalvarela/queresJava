package jcg.zheng.demo.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jcg.zheng.demo.api.BrassInstrument;

public class Trumpet implements BrassInstrument {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void buzz(String song) {
		logger.info(instrumentName() + PLAY_MSG + song);
	}

	@Override
	public String instrumentName() {
		return "Trumpet";
	}

	@Override
	public void play(String song) {
		buzz(song);
	}

}
