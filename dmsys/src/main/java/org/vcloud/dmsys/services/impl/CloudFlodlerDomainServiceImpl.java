package org.vcloud.dmsys.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import java.util.List;
import org.vcloud.dmsys.model.CloudFlodlerDomain;
import org.vcloud.dmsys.mapper.CloudFlodlerDomainMapper;
import org.vcloud.dmsys.services.CloudFlodlerDomainService;
@Service
public class CloudFlodlerDomainServiceImpl extends ServiceImpl<CloudFlodlerDomainMapper, CloudFlodlerDomain> implements CloudFlodlerDomainService{



    @Override
    public int updateBatch(List<CloudFlodlerDomain> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<CloudFlodlerDomain> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(CloudFlodlerDomain record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(CloudFlodlerDomain record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
