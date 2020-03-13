package com.codegym.controller;

import com.codegym.model.MatHang;
import com.codegym.reponsitory.LoaiHangReponsitory;
import com.codegym.reponsitory.MatHangReponsitory;
import com.codegym.service.MatHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class MatHangController {
    @Autowired
    MatHangService matHangService;

    @Autowired
    LoaiHangReponsitory loaiHangReponsitory;

    @GetMapping("/mathangs")
    public ModelAndView list(@ModelAttribute(name = "s") Optional<String> s) {
        List<MatHang> nameMatHang;
        if (s.isPresent()){
            nameMatHang = matHangService.findByName(s.get());
        }else {
            nameMatHang = matHangService.findAll();
        }
        ModelAndView modelAndView = new ModelAndView("list", "mathangs", nameMatHang);
        return modelAndView;
    }


    @GetMapping("/create-mathang")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("loai",loaiHangReponsitory.findAll());
        modelAndView.addObject("mathang", new MatHang());
        return modelAndView;
    }


    @PostMapping("/create-mathang")
    public ModelAndView saveProduct(@ModelAttribute("mathang") MatHang matHang) {
        matHangService.save(matHang);
        ModelAndView modelAndView = new ModelAndView("create");
//        modelAndView.addObject("mathang", new MatHang());
        modelAndView.addObject("message", "Them Thanh Cong Mat Hang");
        return modelAndView;
    }
    @GetMapping("/edit-mathang/{id}")
    public ModelAndView showEditMatHang(@PathVariable Long id) {
        MatHang mathang = matHangService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("loai",loaiHangReponsitory.findAll());
        modelAndView.addObject("mathangs", mathang);
        return modelAndView;
    }

    @PostMapping("/edit-mathang")
    public ModelAndView saveEditMatHang(@ModelAttribute("mathangs") MatHang mathang) {
        matHangService.save(mathang);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("success", "Edit customer add ok");
        modelAndView.addObject("mathang", mathang);
        return modelAndView;
    }

    @GetMapping("/delete-mathang/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        MatHang mathang = matHangService.findById(id);
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("loai",loaiHangReponsitory.findAll());
        modelAndView.addObject("mathang", mathang);
        return modelAndView;
    }
    @PostMapping("/delete-mathang")
    public String deleteProduct(@ModelAttribute("product")MatHang matHang, Model model){
        matHangService.remove(matHang);
        return "redirect:/mathangs";
    }
}
