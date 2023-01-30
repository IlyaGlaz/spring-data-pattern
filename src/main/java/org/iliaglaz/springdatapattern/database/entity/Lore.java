package org.iliaglaz.springdatapattern.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Lore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String movement;

    String weapon;
}
