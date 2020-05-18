package org.vcloud.dmsys.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.List;
import org.vcloud.dmsys.model.LogicCatalogDomain;
import org.vcloud.dmsys.mapper.LogicCatalogDomainMapper;
import org.vcloud.dmsys.services.LogicCatalogDomainService;
@Service
public class LogicCatalogDomainServiceImpl extends ServiceImpl<LogicCatalogDomainMapper, LogicCatalogDomain> implements LogicCatalogDomainService{

    @Override
    public int updateBatch(List<LogicCatalogDomain> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<LogicCatalogDomain> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(LogicCatalogDomain record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(LogicCatalogDomain record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
