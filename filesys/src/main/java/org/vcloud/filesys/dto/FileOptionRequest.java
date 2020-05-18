package org.vcloud.filesys.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.Serializable;


@Data
public class FileOptionRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String opt;

    private File file;

    private Boolean isFile;

    private String fileName;

    private String filePath;

    private MultipartFile multipartFile;





}
