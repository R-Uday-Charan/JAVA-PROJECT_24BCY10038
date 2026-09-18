// Author: R UDAY CHARAN
// Registration Number: 24BCY10038
package edu.ccrm.domain;

/**
 * Wraps a course code string.
 * Having it as its own class makes it easier to validate format later if needed.
 */
public class CourseCode {

    private final String code;

    public CourseCode(String code) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("course code can't be blank");
        }
        this.code = code.trim().toUpperCase();
    }

    public String code() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }
}
