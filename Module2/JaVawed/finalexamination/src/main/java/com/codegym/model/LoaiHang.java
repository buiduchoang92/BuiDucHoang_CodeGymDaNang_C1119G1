package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaihang")
public class LoaiHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLoaiHang;

    private String tenLoaiHang;

    public LoaiHang() {
    }

    public Long getIdLoaiHang() {
        return idLoaiHang;
    }

    public void setIdLoaiHang(Long idLoaiHang) {
        this.idLoaiHang = idLoaiHang;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }

    public List<MatHang> getMatHangList() {
        return matHangList;
    }

    public void setMatHangList(List<MatHang> matHangList) {
        this.matHangList = matHangList;
    }

    @OneToMany(mappedBy = "loaiHang",cascade = CascadeType.ALL)
    private List<MatHang> matHangList;
}
