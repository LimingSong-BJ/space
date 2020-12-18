import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Client {
    @AllArgsConstructor
    @Data
    public static class School {
        private String name;
        private List<Classroom> ClassRooms = new ArrayList<Classroom>();
    }

    @AllArgsConstructor
    @Data
    public static class Classroom {
        private int num;
        private List<Student> students = new ArrayList<>();
    }

    @AllArgsConstructor
    @Data
    public static class Student {
        private String name;
        private int age;
        private float score;
    }

    public static void main(String[] args) {
        Student student1 = new Student("老1", 12, 61);
        Student student2 = new Student("老2", 11, 50);
        Student student3 = new Student("老3", 12, 80);
        Student student4 = new Student("老4", 13, 90);
        Student studentA = new Student("老A", 11, 44);
        Student studentB = new Student("老B", 13, 55);
        Student studentC = new Student("老C", 12, 66);
        ArrayList<Student> students1 = new ArrayList<>();
        ArrayList<Student> students2 = new ArrayList<>();
        ArrayList<Student> studentsB = new ArrayList<>();
        ArrayList<Student> studentsA = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        students2.add(student3);
        students2.add(student4);
        studentsA.add(studentA);
        studentsB.add(studentB);
        studentsB.add(studentC);
        Classroom classroom1 = new Classroom(101, students1);
        Classroom classroom2 = new Classroom(102, students1);
        Classroom classroomA = new Classroom(909, students1);
        Classroom classroomB = new Classroom(910, students1);
        ArrayList<Classroom> classrooms1 = new ArrayList<>();
        classrooms1.add(classroom1);
        classrooms1.add(classroom2);
        ArrayList<Classroom> classrooms2 = new ArrayList<>();
        classrooms2.add(classroomA);
        classrooms2.add(classroomB);
        School school1 = new School("第一小学", classrooms1);
        School school2 = new School("第二小学", classrooms2);
        school1.getClassRooms()
                .forEach(classroom -> classroom.getStudents()
                        .forEach(student -> System.out.println(student))
                );
    }
}
