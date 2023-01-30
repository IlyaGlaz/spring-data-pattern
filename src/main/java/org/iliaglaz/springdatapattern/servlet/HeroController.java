package org.iliaglaz.springdatapattern.servlet;


import lombok.RequiredArgsConstructor;
import org.iliaglaz.springdatapattern.dto.LoreCreateDto;
import org.iliaglaz.springdatapattern.service.HeroService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class HeroController{

    private final HeroService heroService;

    @GetMapping("/hero")
    public String getForm() {
        return "customize";
    }

    @PostMapping("/hero")
    public String equipHero(@ModelAttribute String movement,
                            @ModelAttribute String weapon) {

        heroService.equip(movement, weapon);
        heroService.create(new LoreCreateDto(movement, weapon));

        return "redirect:/battle";
    }
}