package com.example.service.impl;

import com.example.model.BenhNhan;
import com.example.repository.IBenhNhanRepository;
import com.example.service.IBenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenhNhanService implements IBenhNhanService {
    @Autowired
    private IBenhNhanRepository iBenhNhanRepository;

    @Override
    public List<BenhNhan> getAll() {
        return iBenhNhanRepository.getAll();
    }

    public void save(String bacSi, String lyDo, String ngayNhapVien, String ngayRaVien, String phuongPhap, String ten, int benhAnId) {
        iBenhNhanRepository.save(bacSi, lyDo, ngayNhapVien, ngayRaVien, phuongPhap, ten, benhAnId);
    }

    @Override
    public BenhNhan findById(int id) {
        return iBenhNhanRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        iBenhNhanRepository.delete(id);
    }

    @Override
    public void update(String bacSi, String lyDo, String ngayNhapVien, String ngayRaVien, String phuongPhap, String ten, int benhAnId, int id) {
        iBenhNhanRepository.update(bacSi,lyDo,ngayNhapVien,ngayRaVien,phuongPhap,ten,benhAnId,id);
    }

    ;

}
