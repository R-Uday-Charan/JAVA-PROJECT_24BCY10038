// Author: R UDAY CHARAN
// Registration Number: 24BCY10038
package edu.ccrm.domain;

/**
 * Holds the given and family parts of a student's name separately.
 * Easier to sort and display this way rather than storing as one big string.
 */
public class StudentName {

    private final String given;
    private final String family;

    public StudentName(String given, String family) {
        this.given = given == null ? "" : given.trim();
        this.family = family == null ? "" : family.trim();
    }

    public String given() {
        return given;
    }

    public String family() {
        return family;
    }

    // returns "GIVEN FAMILY" — just what you'd see on a register
    public String full() {
        if (given.isEmpty()) {
            return family;
        }
        if (family.isEmpty()) {
            return given;
        }
        return given + " " + family;
    }

    @Override
    public String toString() {
        return full();
    }
}
