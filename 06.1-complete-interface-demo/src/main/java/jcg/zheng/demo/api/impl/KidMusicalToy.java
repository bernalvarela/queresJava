package jcg.zheng.demo.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jcg.zheng.demo.api.BrassInstrument;
import jcg.zheng.demo.api.StringInstrument;

public class KidMusicalToy implements BrassInstrument, StringInstrument {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void bow(String song) {
		logger.info("play a string with a bow " + song);
	}

	@Override
	public void buzz(String song) {
		logger.info("make a buzz sound " + song);
	}

	@Override
	public String demo() {
		return "KidMusicToy play the demo song with String and buzz";
	}

	@Override
	public String instrumentName() {
		return "KidMusicToy";
	}

	@Override
	public void play(String song) {
		bow(song);
		pluck(song);
		buzz(song);
	}

	@Override
	public void pluck(String song) {
		logger.info("play a string with a pluck sound " + song);

	}

}
