package com.javacourse.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static com.javacourse.streams.StudentsList.studentsList;

public class Methods {
    public static List<Students> listByFaculty(String facultyName) {
        return studentsList.stream()
                .filter(s -> s.getFaculty().equals(facultyName))
                .collect(Collectors.toList());
    }

    public static void listByFacultyAndCourse() {
        Map<String, Map<String, List<Students>>> hashMap;

        hashMap = studentsList.stream()
                .collect(Collectors.groupingBy(Students::getFaculty,
                        Collectors.groupingBy(Students::getCourse)));

        Set<Map.Entry<String, Map<String, List<Students>>>> set = hashMap.entrySet();
        for (Map.Entry<String, Map<String, List<Students>>> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }

    public static List<Students> listByYearOfBirth(int yearOfBirth) {
        return studentsList.stream()
                .filter(s -> s.getYearOfBirth() > yearOfBirth)
                .collect(Collectors.toList());
    }

    public static List<Students> oneByYearOfBirth(int yearOfBirth) {
        return studentsList.stream()
                .filter(s -> s.getYearOfBirth() > yearOfBirth).limit(1)
                .collect(Collectors.toList());
    }

    public static List<String> groupList(String groupName) {
        return studentsList.stream()
                .filter(s -> s.getGroup().equals(groupName))
                .map(s -> s.getFirstName() + " " + s.getLastName())
                .collect(Collectors.toList());
    }

    public static long amountOfStudents(String facultyName) {
        return studentsList.stream()
                .filter(s -> s.getFaculty().equals(facultyName))
                .count();
    }

    public static List<String> changeFaculty(String groupName, String newFaculty) {
        return studentsList.stream()
                .filter(s -> s.getGroup().equals(groupName))
                .map(s -> s.setFaculty(newFaculty))
                .collect(Collectors.toList());
    }

    public static List<String> changeGroup(String groupName, String newGroupName) {
        return studentsList.stream()
                .filter(s -> s.getGroup().equals(groupName))
                .map(s -> s.setGroup(newGroupName))
                .collect(Collectors.toList());
    }

    public static Optional<Students> findStudent(String groupName) {
        Optional<Students> sd = studentsList.stream()
                .filter(s -> s.getGroup().equals(groupName))
                .findFirst();
        System.out.println(sd);
        return sd;
    }


    public static String reduce_Method(int amountOfStudents) {
        String reduced = studentsList
                .stream()
                .limit(amountOfStudents)
                .reduce("", (x, y) -> x = x + y.firstName + " " + y.lastName + " - " + y.faculty + ", " + y.group + "\r\n", (x, y) -> x + y);
        System.out.println(reduced);
        return reduced;
    }

    public static void sortedByFaculty() {
        Map<String, List<Students>> hashMap;

        hashMap = studentsList.stream()
                .collect(Collectors.groupingBy(Students::getFaculty));

        Set<Map.Entry<String, List<Students>>> set = hashMap.entrySet();
        for (Map.Entry<String, List<Students>> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

    public static void sortedByCourse() {
        Map<String, List<Students>> hashMap;

        hashMap = studentsList.stream()
                .collect(Collectors.groupingBy(Students::getCourse));

        Set<Map.Entry<String, List<Students>>> set = hashMap.entrySet();
        for (Map.Entry<String, List<Students>> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

    public static void sortedByGroup() {
        Map<String, List<Students>> hashMap;

        hashMap = studentsList.stream()
                .collect(Collectors.groupingBy(Students::getGroup));

        Set<Map.Entry<String, List<Students>>> set = hashMap.entrySet();
        for (Map.Entry<String, List<Students>> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

    public static boolean allStudentsFromThisFaculty(String facultyName) {
        return studentsList.stream()
                .allMatch(s -> s.getFaculty().equals(facultyName));
    }

    public static boolean anyStudentFromThisFaculty(String facultyName) {
        return studentsList.stream()
                .anyMatch(s -> s.getFaculty().equals(facultyName));
    }

    public static boolean allStudentsFromThisGroup(String groupName) {
        return studentsList.stream()
                .allMatch(s -> s.getGroup().equals(groupName));
    }

    public static boolean anyStudentFromThisGroup(String groupName) {
        return studentsList.stream()
                .anyMatch(s -> s.getGroup().equals(groupName));
    }
}
