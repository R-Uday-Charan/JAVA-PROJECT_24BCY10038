// Author: R UDAY CHARAN
// Registration Number: 24BCY10038
package edu.ccrm.domain;

/**
 * Represents a course offered in the campus.
 * Fields match what's in courses.csv, so parsing is straightforward.
 */
public class Course {

    private final CourseCode code;
    private final String title;
    private final int credits;
    private final String instructor;
    private final String semester;
    private final String department;

    public Course(CourseCode code, String title, int credits,
                  String instructor, String semester, String department) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
        this.semester = semester;
        this.department = department;
    }

    public CourseCode code() {
        return code;
    }

    public String title() {
        return title;
    }

    public int credits() {
        return credits;
    }

    public String instructor() {
        return instructor;
    }

    public String semester() {
        return semester;
    }

    public String department() {
        return department;
    }

    @Override
    public String toString() {
        return code + " | " + title + " | " + credits + " credits | " + instructor;
    }
}
