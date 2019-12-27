package com.carol.mySandcastle;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
class MySandcastleApplicationTests {

	@Value("${pagination.amount_per_page}")
	private int amoutPerPage;

	@Test
	void contextLoads() {
	}

	@Test
	public void testApplicarionTest() {
		Assert.assertEquals(100, amoutPerPage);
	}
}
