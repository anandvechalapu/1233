package com.sacral.STPN-179.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nfrn_region")
public class NfrnRegion {

    @Id
    private Long regionId;
    private String regionName;
    private Integer level;

    public NfrnRegion() {}

    public NfrnRegion(Long regionId, String regionName, Integer level) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.level = level;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

}