package org.example;
public class Male extends Person{ // Male sınıfı Person sınıfından türetildi.

    public Male(String name, String surname, String dateOfBirth){

        super(name,surname,dateOfBirth);
    }
    @Override
    public int calculateRetirementAge() {
        return 65;
    } //erkekler 65 yaşında emekli olur.
}
