package org.vcloud.dmsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vcloud.dmsys.entity.LogicCatalogEntity;

public interface LogicCatalogEntityRepository extends JpaRepository<LogicCatalogEntity,Long> {
    LogicCatalogEntity findByCatalogHashName(String hashName);

    LogicCatalogEntity findByCatalogName(String name);
}
