package ogrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course quiz;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
        this.quiz = quiz;
    }
    void addBulkExamNote(int note1, int note2, int note3 , int quiz){

        if(note1 >= 0 && note1 <=100){c1.note = (int) (note1 *(0.8)+ (quiz * 0.2));}
        if(note2>= 0 && note2 <=100){c2.note = (int) (note2 * (0.8) + (quiz * 0.2));}
        if(note3 >= 0 && note3 <=100){c3.note = (int) (note3*(0.8)+ (quiz * 0.2));}
    }
    void isPass(){
        this.avarage =((this.c1.note ) + (this.c2.note) +(this.c3.note)) /3.0 ;
      if (this.avarage >=50){
          System.out.println("GEÇTİ");

      }else {
          System.out.println("KALDI");
      }
      printNote();
    }
    void printNote(){
        System.out.println(c1.name +"Notu: \t"+c1.note);
        System.out.println(c2.name +"Notu: \t"+c2.note);
        System.out.println(c3.name +"Notu: \t"+c3.note);
        System.out.println("Sözlü: \t" +quiz);
        System.out.println("Ortalama: \t"+avarage);


    }
}
