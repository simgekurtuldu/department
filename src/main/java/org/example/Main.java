package org.example;
public class Main {
    public static void main(String[] args) {
        // Örnekler oluştur
        Male malePersonnel = new Male("Ali", "Solmaz", "01.01.1980");
        Female femalePersonnel = new Female("Fatma", "Aktaş", "01.01.1985");
        TeamLead teamLead = new TeamLead("Ayşe", "Güneş", "01.01.1975", "Engineering Lead");
        Department department = new Department(teamLead);

        // Adım 1: Personel ekleyerek ve takım liderini değiştirerek departman özelliklerini güncelle
        department.addPersonnel(malePersonnel);
        System.out.println("1. Adım: Erkek personel eklendi.");

        department.changeTeamLead(teamLead);
        System.out.println("2. Adım: Takım lideri değiştirildi.");

        // Adım 2: Kadın personeli ekleyerek ve görev ekleyerek departman özelliklerini güncelle
        department.addPersonnel(femalePersonnel);
        System.out.println("3. Adım: Kadın personel eklendi.");

        department.addAssignment("Proje A");
        System.out.println("4. Adım: Proje A görevi eklendi.");

        // Adım 3: Görev tamamlandı olarak işaretle ve emeklilik yaşı hesapla
        department.markAssignmentAsCompleted("Proje A");
        System.out.println("5. Adım: Proje A görevi tamamlandı.");

        int erkekEmeklilikYasi = malePersonnel.calculateRetirementAge();
        int kadinEmeklilikYasi = femalePersonnel.calculateRetirementAge();

        // Sonuçları yazdır
        System.out.println("\nSonuçlar:");
        System.out.println("Erkek personelin emeklilik yaşı: " + erkekEmeklilikYasi);
        System.out.println("Kadın personelin emeklilik yaşı: " + kadinEmeklilikYasi);
    }
}
