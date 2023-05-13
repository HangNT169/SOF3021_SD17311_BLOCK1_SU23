package com.poly.hangnt169.B3_CRUDListFixCung.controller;

import com.poly.hangnt169.B3_CRUDListFixCung.entity.SinhVien;
import com.poly.hangnt169.B3_CRUDListFixCung.service.SinhVienService;
import com.poly.hangnt169.B3_CRUDListFixCung.service.impl.SinhVienServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {
    // Khi dung Controller
    // MVC(MODEL - VIEW - CONTROLLER)
    // Khi dung @Controller => Tat ca cac request/ham o trong Controller
    // => LUON LUON TRA VE 1 VIEW (RETURN 1 STRING)

    private SinhVienService sinhVienService = new SinhVienServiceImpl();
    // Interface = new Class
    private List<SinhVien> sinhViens = new ArrayList<>();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiSinhVien(Model model) {
        sinhViens = sinhVienService.getAll();
        model.addAttribute("lists", sinhViens);
        return "/buoi3/sinhviens";
    }

//    @GetMapping("/aaaaaaa")
//    @ResponseBody
//    // => API => Tra ve kieu du lieu mong muon
//    public List<SinhVien> test() {
//        List<SinhVien> listSinhVien = new ArrayList<>();
//        listSinhVien.add(new SinhVien("HE130461", "Nguyen Thuy Hang", 10, "Ha Noi", false));
//        listSinhVien.add(new SinhVien("HE130462", "Nguyen Hoang Tien", 11, "Ha Noi1", true));
//        listSinhVien.add(new SinhVien("HE130463", "Nguyen Anh Dung", 15, "Ha Noi3", true));
//        listSinhVien.add(new SinhVien("HE130464", "Vu Van Nguyen", 14, "Ha Noi6", true));
//        listSinhVien.add(new SinhVien("HE130465", "Tran Tuan Phong", 20, "Ha Noi7", true));
//        return listSinhVien;
//    }
}
