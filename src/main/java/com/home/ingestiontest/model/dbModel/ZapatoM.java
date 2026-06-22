package com.home.ingestiontest.model.dbModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class ZapatoM  {

    @Id
    private Long id1;
    Long id;
    String marca;
    String modelo;
    Integer talla;
    String color;
}