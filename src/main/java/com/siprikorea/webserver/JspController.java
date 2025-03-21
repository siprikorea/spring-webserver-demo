package com.siprikorea.webserver;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {
    @RequestMapping("/{path}/**")
    public String process(HttpServletRequest request) {
        String path = request.getRequestURI();
        path = path.replaceFirst("/jsp", "");
        return path;
    }
}