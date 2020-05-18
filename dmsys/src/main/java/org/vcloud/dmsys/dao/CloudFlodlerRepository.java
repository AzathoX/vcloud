package org.vcloud.dmsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.vcloud.dmsys.entity.CloudFlodlerEntity;
import org.vcloud.dmsys.model.CloudFlodlerDomain;

import java.util.List;

public interface CloudFlodlerRepository extends JpaRepository<CloudFlodlerEntity,Long> {

}

