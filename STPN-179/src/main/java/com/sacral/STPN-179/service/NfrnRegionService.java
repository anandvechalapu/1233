package com.sacral.STPN-179.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.STPN-179.model.NfrnRegion;
import com.sacral.STPN-179.repository.NfrnRegionRepository;

@Service
public class NfrnRegionService {

    @Autowired
    private NfrnRegionRepository nfrnRegionRepository;

    public List<NfrnRegion> getAllRegions() {
        return nfrnRegionRepository.findAll();
    }

    public NfrnRegion getRegionByRegionIdAndLevel(Long regionId) {
        return nfrnRegionRepository.findByRegionIdAndLevel(regionId);
    }

}