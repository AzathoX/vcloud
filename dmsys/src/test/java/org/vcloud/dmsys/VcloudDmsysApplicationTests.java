package org.vcloud.dmsys;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.nrocn.lib.baserqnp.AbstractResponse;
import org.nrocn.lib.baserqnp.IMicroResponsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.vcloud.common.dto.WebResponse;
import org.vcloud.dmsys.config.DmsysConfig;
import org.vcloud.dmsys.controller.MainSvController;
import org.vcloud.dmsys.controller.WorkStationSvController;
import org.vcloud.dmsys.dao.LogicCatalogEntityRepository;
import org.vcloud.dmsys.dao.PrartitionEntityRepository;
import org.vcloud.dmsys.dto.FileDomainAndWkstationResponse;
import org.vcloud.dmsys.dto.FileDomainRequest;
import org.vcloud.dmsys.dto.WorkStationDomainRequest;
import org.vcloud.dmsys.entity.LogicCatalogEntity;
import org.vcloud.dmsys.entity.PrartitionEntity;
import org.vcloud.dmsys.model.CloudFlodlerDomain;
import org.vcloud.dmsys.model.PrartitionDomain;
import org.vcloud.dmsys.model.TreeCloudFlodlerDomain;
import org.vcloud.dmsys.services.CloudFlodlerDomainService;
import org.vcloud.dmsys.services.PrartitionDomainService;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootTest
class VcloudDmsysApplicationTests {

	@Autowired
	private PrartitionDomainService prartitionDomainService;



	@Autowired
	private PrartitionEntityRepository prartitionEntityRepository;


	@Autowired
	private LogicCatalogEntityRepository logicCatalogEntityRepository;


	@Autowired
	private MainSvController mainSvController;

	@Autowired
	private DmsysConfig dmsysConfig;

	@Autowired
	private WorkStationSvController workStationSvController;


	@Autowired
	private CloudFlodlerDomainService cloudFlodlerDomainService;


	@Test
	void jpaTest(){
		LogicCatalogEntity one = logicCatalogEntityRepository.findByCatalogHashName("7ef7aab4adf451e263cb905a92f34c63");
		System.out.println(one);
	}

	@Test
	void contextLoads() {
		FileDomainRequest fileDomainRequest = new FileDomainRequest();
		fileDomainRequest.setVpName("/test");
		fileDomainRequest.setIsFile(true);
		fileDomainRequest.setFilesys("");
		System.out.println(mainSvController.praritionApplyFor(fileDomainRequest));
	}

	@Test
	void createCatalog(){
			FileDomainRequest fileDomainRequest = new FileDomainRequest();
			fileDomainRequest.setVpHashName("ba66c314a4cbc0907c9afa438a1def1b");
			fileDomainRequest.setIsFile(true);
			fileDomainRequest.setCatalogName("逻辑目录");
			fileDomainRequest.setFilesys("");
		    System.out.println(mainSvController.catalogApplyFor(fileDomainRequest));
	}

	@Test
	void testFileAdd(){
		FileDomainRequest fileDomainRequest = new FileDomainRequest();
		fileDomainRequest.setCatalogHashName("ccd136474e6d4f45e276983336fb9451");
		fileDomainRequest.setName("测试.txt");
		fileDomainRequest.setParentId(1L);
		fileDomainRequest.setIsFile(true);
		fileDomainRequest.setIsRoot(false);
		mainSvController.fileAdd(fileDomainRequest);
	}


	@Test
	void testFile(){
		List<CloudFlodlerDomain> list = cloudFlodlerDomainService.list();
//		list.forEach(System.out::println);
	}

	@Test
	void getwkstation(){
		TreeCloudFlodlerDomain treeCloudFlodlerDomain = workStationSvController.cloudFolderTree(873L);
		System.out.println(treeCloudFlodlerDomain);
	}

//	@Test
	void batchCreateFile(){
		WorkStationDomainRequest workStationDomainRequest = new WorkStationDomainRequest();
		String[] fileName = new String[]{
				"佛山分公司",
				"机关党委",
				"顺德分公司",
				"南海分公司",
				"禅城分公司",
				"高明分公司",
				"三水分公司"
		};

		for (int i = 0; i < fileName.length; i++) {
			workStationDomainRequest.setFileName(fileName[i]);
			workStationDomainRequest.setId(2L);
			workStationDomainRequest.setIsFile(false);
			workStationSvController.fileUpload(workStationDomainRequest);
		}

	}
//
//	@Test
	void createSubFile(){


	}

	@Test
	void treeTest(){
		long current = System.currentTimeMillis();
		System.out.println(workStationSvController.myWorkStationByTreeMap(2L));
		long userTime = System.currentTimeMillis() - current;
		Calendar instance = Calendar.getInstance();
		instance.setTimeInMillis(userTime);
		int i = instance.get(Calendar.MINUTE);
		int se = instance.get(Calendar.SECOND);
		System.out.println(se);
	}


	@Test
	void getList(){
		System.out.println(workStationSvController.queryFileByParentId("874", 1));
	}


	@Test
	void getFileBroadwise(){
		workStationSvController.doMyWorkStationByTreeMap(873L);
	}
}
