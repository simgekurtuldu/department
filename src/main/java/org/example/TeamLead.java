package org.example;

public class TeamLead extends Person{
    private String teamLeadTitle;

    public TeamLead(String name, String surname, String dateOfBirth, String teamLeadTitle) {
        super(name, surname, dateOfBirth);
        this.teamLeadTitle = teamLeadTitle;
    }
    // TeamLead sınıfının soyut metodu implemente edilir
    @Override
    public int calculateRetirementAge() {
        // Özel durum: TeamLead sınıfı için emeklilik yaşı 60
        return 60;
    }
}