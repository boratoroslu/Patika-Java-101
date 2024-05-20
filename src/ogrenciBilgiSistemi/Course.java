package ogrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
        int quiz = 0;
    }
    void printTeachInfo(){
        this.teacher.print();
    }
}
