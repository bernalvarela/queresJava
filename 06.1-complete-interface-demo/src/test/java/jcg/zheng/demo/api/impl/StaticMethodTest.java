package jcg.zheng.demo.api.impl;

import org.junit.Test;

import jcg.zheng.demo.api.MusicalInstrument;

public class StaticMethodTest {
	@Test
	public void test_static_method() {
		System.out.println(MusicalInstrument.repair());
	}
}
