package org.vcloud.filesys.services;

import org.vcloud.filesys.dto.FileOptionRequest;

import java.io.File;

public interface IFileOptionServices {
     IFileOptStragy doService(FileOptionRequest fileOptionRequest , String opt);
}
