package jcg.zheng.demo.api.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jcg.zheng.demo.api.MusicalInstrument;

public class RuntimeTest {

    @Test
    public void runtime_injection() {
	MusicalInstrument violin = violinBuilder(false);
	assertEquals(Violin.class, violin.getClass());

    }

    @Test
    public void runtime_injection_2() {
	MusicalInstrument violin = violinBuilder(true);
	assertEquals(Violin2.class, violin.getClass());

    }

    private MusicalInstrument violinBuilder(boolean isVersion2) {
	MusicalInstrument violin;
	if (isVersion2) {
	    violin = new Violin2();
	} else {
	    violin = new Violin();
	}
	return violin;
    }
}
