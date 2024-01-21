package org.example;

import java.time.LocalDate;

public class Female extends Person{ //Female sınıfı Person sınıfından türetildi.

    public Female(String name, String surname, String dateOfBirth){
        super(name,surname,dateOfBirth);
    }
    @Override
    public int calculateRetirementAge() {
        return 60; // kadınlar 60 yaşında emekli olur.
    }

}
