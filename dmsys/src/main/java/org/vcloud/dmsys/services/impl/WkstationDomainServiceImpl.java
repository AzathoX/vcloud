package org.vcloud.dmsys.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

import org.vcloud.dmsys.mapper.WkstationDomainMapper;
import org.vcloud.dmsys.model.WkstationDomain;
import org.vcloud.dmsys.services.WkstationDomainService;
@Service
public class WkstationDomainServiceImpl extends ServiceImpl<WkstationDomainMapper, WkstationDomain> implements WkstationDomainService{

    @Override
    public int updateBatch(List<WkstationDomain> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<WkstationDomain> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(WkstationDomain record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(WkstationDomain record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
