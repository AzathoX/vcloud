package org.vcloud.dmsys.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@ToString
public class TreeCloudFlodlerDomain {
    private Long flodlerId;

    private  CloudFlodlerDomain cloudFlodlerDomain;

    private List<CloudFlodlerDomain> cloudFlodlerDomains;

    private  List<TreeCloudFlodlerDomain> treeCloudFlodlerDomains;

    public   void addCloudFloaderDomains(CloudFlodlerDomain cloudFlodlerDomain){
         if(this.cloudFlodlerDomains == null){
             this.cloudFlodlerDomains = new ArrayList<>();
         }
         this.cloudFlodlerDomains.add(cloudFlodlerDomain);
    }

    public   void addTreeCloudFloaderDomains(TreeCloudFlodlerDomain treeCloudFlodlerDomain){
        if(this.treeCloudFlodlerDomains == null){
            this.treeCloudFlodlerDomains = new ArrayList<>();
        }
        this.treeCloudFlodlerDomains.add(treeCloudFlodlerDomain);
    }

    @Override
    public String toString() {
        return "TreeCloudFlodlerDomain{" +
                "flodlerId=" + flodlerId +
                ", cloudFlodlerDomain=" + cloudFlodlerDomain +
                ", cloudFlodlerDomains=" + cloudFlodlerDomains +
                ", treeCloudFlodlerDomains=" + treeCloudFlodlerDomains +
                '}';
    }
}
