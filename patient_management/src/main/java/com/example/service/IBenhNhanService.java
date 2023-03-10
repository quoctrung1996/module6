package com.example.service;

import com.example.model.BenhNhan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBenhNhanService {
    List<BenhNhan> getAll();

    Page<BenhNhan> findAll(Pageable pageable);

    void save(String bacSi, String lyDo, String ngayNhapVien, String ngayRaVien, String phuongPhap, String ten, int benhAnId);

    BenhNhan findById(int id);

    void delete(int id);

    void update(String bacSi, String lyDo, String ngayNhapVien, String ngayRaVien, String phuongPhap, String ten, int benhAnId, int id);

    Page<BenhNhan> getListBySearch(Pageable pageable, String ten, String bacSi);
}
