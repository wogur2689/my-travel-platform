package com.travel.wogur2689.user.pub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
//@RequiredArgsConstructor
public class PubPageController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }
}