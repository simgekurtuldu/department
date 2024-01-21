package org.example;
import java.util.ArrayList;
import java.util.List;


public class Department {
    private TeamLead teamLead;
    private List<Person> personnelList;
    private List<String> assignmentList;
    public Department(TeamLead teamLead){ //constructor
        this.teamLead=teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }
    public void changeTeamLead(TeamLead newTeamLead){
        this.teamLead = newTeamLead;
    }//takım lideri değiştirme

    public void addPersonnel(Person person){
        personnelList.add(person);
    }//personel ekleme metodu
    public void addAssignment(String assignment) {// Görev ekleme metodu
        assignmentList.add(assignment);
    }
    public void markAssignmentAsCompleted(String assignment) { // Görevi tamamlandı olarak işaretleme metodu
        assignmentList.remove(assignment);
        System.out.println("Atanan iş tamamlandı:  " + assignment);
    }
}
