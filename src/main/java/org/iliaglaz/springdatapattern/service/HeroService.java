package org.iliaglaz.springdatapattern.service;

import lombok.RequiredArgsConstructor;
import org.iliaglaz.springdatapattern.character.Hero;
import org.iliaglaz.springdatapattern.database.dao.LoreDao;
import org.iliaglaz.springdatapattern.database.entity.Lore;
import org.iliaglaz.springdatapattern.dto.LoreCreateDto;
import org.iliaglaz.springdatapattern.factory.Movement;
import org.iliaglaz.springdatapattern.factory.Weapon;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeroService {

    private final LoreDao loreDao;
    private Hero hero;

    public void equip(String movement, String weapon) {
        hero = new Hero(Movement.of(movement), Weapon.of(weapon));
        hero.onRide();
        hero.onFight();
    }

    public void create(LoreCreateDto loreDto) {
        loreDao.save(Lore.builder()
                .movement(loreDto.getMovement())
                .weapon(loreDto.getWeapon())
                .build()
        );
    }

    public Hero getHero() {
        return hero;
    }
}
