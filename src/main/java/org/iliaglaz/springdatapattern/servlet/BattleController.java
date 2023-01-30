package org.iliaglaz.springdatapattern.servlet;

import lombok.RequiredArgsConstructor;
import org.iliaglaz.springdatapattern.service.HeroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BattleController {

    private final HeroService heroService;

    @GetMapping("/battle")
    public String doBattle(Model model) {
        model.addAttribute("hero", heroService.getHero());

        return "hero";
    }
}