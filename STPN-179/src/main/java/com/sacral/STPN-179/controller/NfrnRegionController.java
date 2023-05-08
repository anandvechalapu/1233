package com.sacral.STPN-179.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.STPN-179.model.NfrnRegion;
import com.sacral.STPN-179.service.NfrnRegionService;

@RestController
@RequestMapping("/api/regions")
public class NfrnRegionController {

    @Autowired
    private NfrnRegionService nfrnRegionService;

    @GetMapping
    public List<NfrnRegion> getAllRegions() {
        return nfrnRegionService.getAllRegions();
    }

    @GetMapping("/{regionId}")
    public NfrnRegion getRegionByRegionIdAndLevel(@PathVariable Long regionId) {
        return nfrnRegionService.getRegionByRegionIdAndLevel(regionId);
    }

}