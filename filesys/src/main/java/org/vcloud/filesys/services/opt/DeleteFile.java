package org.vcloud.filesys.services.opt;

import cn.hutool.core.io.FileUtil;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.vcloud.filesys.dto.FileOptionRequest;
import org.vcloud.filesys.services.IFileOptStragy;

import java.io.File;

@Component
@Data
public class DeleteFile implements IFileOptStragy {

    private  File file;

    private FileOptionRequest fileOptionRequest;


    @Override
    public String support() {
        return "del";
    }

    @Override
    public void handle() {
        FileUtil.del(file);
    }


    @Override
    public String getOptCn() {
        return "删除文件";
    }
}
