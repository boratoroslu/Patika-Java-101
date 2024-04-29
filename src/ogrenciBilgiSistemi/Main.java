package ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
Teacher t1 = new Teacher("Bora Toroslu" , "542781237","FZK");
Teacher t2 = new Teacher("Mahmut Hoca","05337851296","TRH");
Course tarih = new Course("tarih","101", "TRH",t2);
        Course fizik = new Course("fizik","102", "FZK",t2);
        Course biyo = new Course("Biyoloji","103", "BİO",t2);

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
tarih.printTeachInfo();
    }

}
