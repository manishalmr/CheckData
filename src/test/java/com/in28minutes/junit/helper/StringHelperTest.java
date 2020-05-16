package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class StringHelperTest {

	@Test
	public void test() {
		StringHelper hlp = new StringHelper();
		assertEquals("true",((Boolean) hlp.areFirstAndLastTwoCharactersTheSame("manisma")).toString());
	}
	

}
