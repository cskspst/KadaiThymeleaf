package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KadaiFormController {

    @GetMapping("/input")
    // 初期状態ではパラメータがないため required = false とする
    public String getInput(@RequestParam(name="previous", required = false) String previous, Model model) {
        model.addAttribute("previous", previous);
        return "input";
    }

    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        model.addAttribute("val", val);
        return "output";
    }
}
