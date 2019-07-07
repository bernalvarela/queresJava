package jcg.zheng.demo.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import jcg.zheng.demo.api.MusicalInstrument;

public class AbstractionTest {

    List<MusicalInstrument> musicInstruments = new ArrayList<>();

    @Test
    public void polymorphism_with_abstract_method() {
	musicInstruments.forEach(mi -> mi.play("Hello"));
    }

    @Test
    public void polymorphism_with_default_method() {
	musicInstruments.forEach(mi -> System.out.println(mi.demo()));
    }

    @Before
    public void setupBand() {
	musicInstruments.add(new Violin());
	musicInstruments.add(new Viola());
	musicInstruments.add(new Bell());
	musicInstruments.add(new Drum());
	musicInstruments.add(new Trumpet());
	musicInstruments.add(new Tuba());
	musicInstruments.add(new KidMusicalToy());
	musicInstruments.add(new KidDrumToy());
	musicInstruments.add(new Violin2());

    }

}
