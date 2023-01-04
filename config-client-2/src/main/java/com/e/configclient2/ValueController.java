package com.e.configclient2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RefreshScope
@Controller
@ResponseBody
@RequestMapping("/api/tree")
public class ValueController {

    @Autowired
    Environment env;

    @GetMapping("/")
    public String getTreeById() {
        return String.join(" -- ", env.getProperty("hello.message"),env.getProperty("hello.done"),env.getProperty("one.two.three")

        );
    }
}
