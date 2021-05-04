package com.javacourse.streams;

public class Students {
        private final int id;
        public final String firstName;
        public final String lastName;
        private final int yearOfBirth;
        private final String address;
        private final String telephone;
        public String faculty;
        private final String course;
        public String group;

        public Students (int id, String firstName, String lastName, int yearOfBirth, String address, String telephone, String faculty, String course, String group) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.yearOfBirth = yearOfBirth;
            this.address = address;
            this.telephone = telephone;
            this.faculty = faculty;
            this.course = course;
            this.group = group;
        }

        public int getId () {
        return id;
        }


        public String getFirstName () {
            return firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public int getYearOfBirth () {
            return yearOfBirth;
        }

        public String getAddress () {
            return address;
        }

        public String getTelephone () {
            return telephone;
        }

    public String getFaculty () {
        return faculty;
    }

        public String getCourse() {
            return course;
        }

        public String getGroup() {
            return group;
        }

        public String setFaculty (String faculty) {
            return this.faculty = faculty;
        }

        public String setGroup (String group) {
            return  this.group = group;
        }

        @Override
        public String toString () {
            return "Student{" + "id: " + id + ", firstName: " + firstName
                    + ", lastName: " + lastName + ", yearOfBirth: " + yearOfBirth +
                    ", address: " + address + ", telephone: " + telephone + ", faculty: " + faculty
                    + ", course: " + course + ", group: " + group + "}";
        }
    }

