package com.example2.tabledisplay.controllertable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Tablecontroller {
@GetMapping("/tabledisplay")
    public String tableconfig(Model model){
            List<tableuser> tbuser=new ArrayList<>();
            tbuser.add(new tableuser(1,"syska led",1000, "/images/syska-led-bulb.jpg"));
            tbuser.add(new tableuser(2,"godreg",20000, "/images/godrej.jpg"));
            tbuser.add(new tableuser(3,"macbook pro",90000, "/images/mac.jpg"));
            model.addAttribute("tbusers", tbuser);
            return "table";
    }
}
