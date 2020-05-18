package org.vcloud.dmsys.services;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.vcloud.dmsys.entity.PrartitionEntity;
import org.vcloud.dmsys.model.PrartitionDomain;
import java.util.List;

public interface PrartitionDomainService extends IService<PrartitionDomain> {



    int insert(PrartitionDomain record);

    int insertOrUpdate(PrartitionDomain record);

    int insertOrUpdateSelective(PrartitionDomain record);


    PrartitionDomain selectByPrimaryKey(Long id);

    int updateBatch(List<PrartitionDomain> list);


    int batchInsert(List<PrartitionDomain> list);

}



