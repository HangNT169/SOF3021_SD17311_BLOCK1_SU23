package com.poly.hangnt169.B3_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // contructor all tham so
@NoArgsConstructor // contructor k tham so
@Getter
@Setter
@ToString
public class SinhVien {

    private String mssv;

    private String ten;

    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;

    // @Data <=> Import * (import willcast)
    // Ctrl Alt O => Xoa import thua

}
