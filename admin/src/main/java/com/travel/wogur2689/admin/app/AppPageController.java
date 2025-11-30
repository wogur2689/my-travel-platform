package com.travel.wogur2689.admin.app;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class AppPageController {

    @GetMapping("/myPage")
    public String mainPage() {
        return "myPage";
    }
}