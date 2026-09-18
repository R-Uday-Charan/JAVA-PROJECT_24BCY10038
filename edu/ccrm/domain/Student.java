// Author: R UDAY CHARAN
// Registration Number: 24BCY10038
package edu.ccrm.domain;

/**
 * Represents a student in the system.
 * Keeping it simple — just the fields we actually use right now.
 */
public class Student {

    private final String regNo;
    private final StudentName name;
    private final String email;

    public Student(String regNo, StudentName name, String email) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
    }

    public String regNo() {
        return regNo;
    }

    public StudentName name() {
        return name;
    }

    public String email() {
        return email;
    }

    @Override
    public String toString() {
        // good enough for debugging
        return regNo + " | " + name.full() + " | " + email;
    }
}
