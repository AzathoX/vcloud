package org.vcloud.filesys.services.opt;

import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.vcloud.filesys.dto.FileOptionRequest;
import org.vcloud.filesys.services.IFileOptStragy;

import java.io.File;
import java.io.IOException;


@Component
@Data
public class UploadFile implements IFileOptStragy {

    private File file;

    private FileOptionRequest fileOptionRequest;

    @Override
    public String getOptCn() {
        return "文件上传";
    }

    @Override
    public String support() {
        return "upload";
    }

    @Override
    public void handle() {
        MultipartFile multipartFile = fileOptionRequest.getMultipartFile();
        if(ObjectUtils.anyNotNull(multipartFile)){
            try {
                multipartFile.transferTo(this.file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
