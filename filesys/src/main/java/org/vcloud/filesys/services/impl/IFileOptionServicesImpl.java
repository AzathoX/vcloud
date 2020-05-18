package org.vcloud.filesys.services.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.vcloud.filesys.config.BeanUtils;
import org.vcloud.filesys.dto.FileOptionRequest;
import org.vcloud.filesys.services.IFileOptStragy;
import org.vcloud.filesys.services.IFileOptionServices;

import java.io.File;

@Service
public class IFileOptionServicesImpl implements IFileOptionServices {

    private ApplicationContext applicationContext = BeanUtils.getApplicationContext();

    @Override
    public IFileOptStragy doService(FileOptionRequest fileOptionRequest , String opt) {
        String[] beanNamesForType = applicationContext.getBeanNamesForType(IFileOptStragy.class);
        for (String beanName : beanNamesForType) {
            IFileOptStragy bean = (IFileOptStragy) applicationContext.getBean(beanName);
            if(bean.support().equals(opt)){
                bean.setFileOptionRequest(fileOptionRequest);
                bean.setFile(fileOptionRequest.getFile());
                bean.handle();
                return bean;
            }
        }
        return null;
    }
}
