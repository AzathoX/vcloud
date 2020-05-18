package org.vcloud.filesys;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.vcloud.filesys.controller.MainSvController;

@SpringBootTest
class FilesysApplicationTests {

	@Autowired
	MainSvController mainSvController;

	@Test
	void contextLoads() {
	}

}
