package org.vcloud.dmsys.services;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import org.vcloud.dmsys.model.CloudFlodlerDomain;

public interface CloudFlodlerDomainService extends IService<CloudFlodlerDomain> {


    int updateBatch(List<CloudFlodlerDomain> list);

    int batchInsert(List<CloudFlodlerDomain> list);

    int insertOrUpdate(CloudFlodlerDomain record);

    int insertOrUpdateSelective(CloudFlodlerDomain record);

}
