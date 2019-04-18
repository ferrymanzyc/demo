package com.example.demo.pojo;


import javax.persistence.*;

@Entity
@Table(name="policylist")
public class Policylist {


    String policyId;
    String policyName;
    Integer policyType;
    String parentId;
    String resType;
    String resClass;
    String resIds;



    @Id
    @GeneratedValue
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }



    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Integer getPolicyType() {
        return policyType;
    }

    public void setPolicyType(Integer policyType) {
        this.policyType = policyType;
    }


    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getResClass() {
        return resClass;
    }

    public void setResClass(String resClass) {
        this.resClass = resClass;
    }

    public String getResIds() {
        return resIds;
    }

    public void setResIds(String resIds) {
        this.resIds = resIds;
    }
}
