package com.sunshine.algorithm.leetcode.jvm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-02-12
 */
@DisplayName("Z字形变换测试类")
public class ZConvertTest {

	@Test
	public void zConverterTestOne() {
		Assertions.assertEquals("LCIRETOESIIGEDHN", new ZConvert().convert("LEETCODEISHIRING", 3));
	}

	@Test
	public void zConverterTestTwo() {
		Assertions.assertEquals("LDREOEIIECIHNTSG", new ZConvert().convert("LEETCODEISHIRING", 4));
	}

	@Test
	public void zConverterTestThree() {
		Assertions.assertEquals("AB", new ZConvert().convert("AB", 1));
	}
}
