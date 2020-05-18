package org.vcloud.dmsys.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.vcloud.dmsys.model.LogicCatalogDomain;

@Mapper
public interface LogicCatalogDomainMapper extends BaseMapper<LogicCatalogDomain> {
    int updateBatch(List<LogicCatalogDomain> list);

    int batchInsert(@Param("list") List<LogicCatalogDomain> list);

    int insertOrUpdate(LogicCatalogDomain record);

    int insertOrUpdateSelective(LogicCatalogDomain record);
}