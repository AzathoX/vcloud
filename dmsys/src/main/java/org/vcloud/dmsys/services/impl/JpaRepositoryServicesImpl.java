package org.vcloud.dmsys.services.impl;

import org.nrocn.user.dao.UserRepository;
import org.nrocn.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vcloud.dmsys.dao.LogicCatalogEntityRepository;
import org.vcloud.dmsys.dao.PrartitionEntityRepository;
import org.vcloud.dmsys.dao.WorkStationRepository;
import org.vcloud.dmsys.entity.LogicCatalogEntity;
import org.vcloud.dmsys.entity.WkstationEntity;
import org.vcloud.dmsys.services.JpaRepositoryServices;

import java.util.List;


@Service
public class JpaRepositoryServicesImpl implements JpaRepositoryServices {

    @Autowired
    private LogicCatalogEntityRepository logicCatalogEntityRepository;

    @Autowired
    private PrartitionEntityRepository prartitionEntityRepository;

    @Autowired
    private WorkStationRepository workStationRepository;


    @Autowired
    private UserRepository userRepository;




    @Override
    public List<LogicCatalogEntity> cataloglist(){
        return  logicCatalogEntityRepository.findAll();
    }

    @Override
    public LogicCatalogEntity findByCatalogName(String name){
        return logicCatalogEntityRepository.findByCatalogName(name);
    }

    @Override
    public UserEntity findByUserName(String userName){
        return  userRepository.findByUsername(userName);
    }

    @Override
    public LogicCatalogEntity findByCatalogHashName(String hashName){
        return logicCatalogEntityRepository.findByCatalogHashName(hashName);
    }

    @Override
    public WkstationEntity findWorkStationById(Long id){
        return  workStationRepository.findById(id).get();
    }

    @Override
    public List<WkstationEntity> findWorkStationByUserId(Long userId){
        return  workStationRepository.findByUserId(userId);
    }



}
