package org.vcloud.account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.vcloud.account.controller.MainSvController;

@SpringBootTest
class AccountApplicationTests {

	@Autowired
	private MainSvController mainSvController;



	@Test
	void contextLoads() {
//		System.out.println(mainSvController.login("hlloworld", "1345678"));
	}

}
