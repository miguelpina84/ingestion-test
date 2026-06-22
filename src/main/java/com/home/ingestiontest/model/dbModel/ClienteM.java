package com.home.ingestiontest.model.dbModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class ClienteM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<ZapatoM> zapatos;

    @OneToMany(mappedBy = "cliente")
    private List<VehiculoM> vehiculos;
}
