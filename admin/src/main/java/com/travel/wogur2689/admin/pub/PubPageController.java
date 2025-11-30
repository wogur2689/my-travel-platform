package com.travel.wogur2689.admin.pub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@Controller
//@RequiredArgsConstructor
public class PubPageController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/{city}")
    public String cityPage(@PathVariable String city) {
        return city + "/index";
    }

    @GetMapping("/{city}/intro")
    public String intro(@PathVariable String city) {
        return city + "/intro";
    }
}