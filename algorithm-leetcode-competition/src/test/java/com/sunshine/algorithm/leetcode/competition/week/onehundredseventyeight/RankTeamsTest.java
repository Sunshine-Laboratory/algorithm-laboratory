package com.sunshine.algorithm.leetcode.competition.week.onehundredseventyeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-01
 */
@DisplayName("通过投票对团队排名测试类")
public class RankTeamsTest {

	@Test
	public void rankTeamsTestOne() {
		Assertions.assertEquals("ACB", new RankTeams().rankTeams(new String[]{"ABC", "ACB", "ABC", "ACB", "ACB"}));
	}

	@Test
	public void rankTeamsTestTwo() {
		Assertions.assertEquals("XWYZ", new RankTeams().rankTeams(new String[]{"WXYZ", "XYZW"}));
	}

	@Test
	public void rankTeamsTestThree() {
		Assertions.assertEquals("ABC", new RankTeams().rankTeams(new String[]{"BCA", "CAB", "CBA", "ABC", "ACB", "BAC"}));
	}
}
