package org.vcloud.dmsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vcloud.dmsys.entity.WkstationEntity;

import java.util.List;

public interface WorkStationRepository  extends JpaRepository<WkstationEntity,Long> {
    List<WkstationEntity> findByUserId(Long userId);
}
