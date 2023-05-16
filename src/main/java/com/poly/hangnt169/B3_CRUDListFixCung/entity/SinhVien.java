package com.poly.hangnt169.B3_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // contructor all tham so
@NoArgsConstructor // contructor k tham so
@Getter
@Setter
@ToString
@Builder // Tao ra contructor co so luong tham so tuy y
// Neu truyen vao 1 tham so => Contructor 1 tham so...
public class SinhVien {

    private String mssv;

    private String ten;

    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;

    // @Data <=> Import * (import willcast)
    // Ctrl Alt O => Xoa import thua

}
