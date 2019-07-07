package jcg.zheng.demo.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jcg.zheng.demo.api.PercussionInstrument;

public class KidDrumToy implements PercussionInstrument {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String demo() {
		return "KidDrumToy play the demo song by hitting and shaking";
	}

	@Override
	public void hit(String song) {
		logger.info(instrumentName() + PLAY_MSG + song + " when is hit.");
	}

	@Override
	public String instrumentName() {
		return "KidMusicToy";
	}

	@Override
	public void play(String song) {
		hit(song);
		shake(song);
	}

	@Override
	public void shake(String song) {
		logger.info(instrumentName() + PLAY_MSG + song  + " when is shaked.");
	}

}
