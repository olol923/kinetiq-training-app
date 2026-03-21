package com.kinetiq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/modules")
public class ModulesController {

    @GetMapping
    public String getModulesPanel() {
        // Logic to interact with the modules panel
        return "modulesPanel"; // View name
    }
}
