# Project Statement

**Author:** R UDAY CHARAN  
**Registration Number:** 24BCY10038

---

## Problem Statement

Managing student records and course information in a college manually is a pain. Things get lost, data gets duplicated, and there's no clean way to search or sort anything. This project is basically my attempt at building a small tool that handles that — storing student and course data in CSV files, and giving a simple way to load, sort, and work with that data through Java code.

It's not a full-blown system, but it covers the core operations that would actually be useful in a real campus setting.

---

## Scope

This project focuses on:

- Reading and managing student records from a CSV file
- Reading and managing course data from a CSV file  
- Sorting students (by name) and courses (by course code)
- Utility operations on arrays and file paths
- Keeping things simple — no databases, no external libraries, just plain Java

What it does **not** cover (at least for now):
- A full GUI or web interface
- Enrollment logic (linking students to specific courses)
- Authentication or user roles

---

## Target Users

Primarily for college staff or lab instructors who need a lightweight way to manage and look up student and course records without setting up a heavy database system. Could also just be useful for academic demonstration purposes.

---

## Features

- **Student record management** — load and store student data with fields like registration number, name, and email
- **Course record management** — load course data including course code, title, credits, instructor, semester, and department
- **Sorting** — sort students by name, sort courses by their course code
- **Array helpers** — small utility methods like `join` and `tail` that make working with string arrays easier
- **File size utility** — recursively calculate total size of files under a folder (useful for checking data directory size)
- **CSV-based storage** — data lives in plain `.csv` files, easy to open and edit manually if needed

---

## Why I built it this way

I kept the architecture simple on purpose. Everything is in plain Java with no external dependencies. The idea was that anyone with just a JDK installed should be able to compile and run this without any setup headaches. The CSV files also make it transparent — you can just open them in Excel or any text editor to check what's in there.

---

## Objectives

The main thing I wanted to get out of this project was to actually apply what we covered in class — not just write code that compiles, but structure it in a way that makes sense.

Specific goals:
- Build a working domain model for students and courses using proper Java classes
- Use the Comparator interface for sorting, since that was covered in the course
- Keep data in flat files (CSV) and read them using Java's file I/O
- Write utility methods that are reusable and not tied to one specific use case
- Make the codebase something a classmate could pick up and understand without a lengthy explanation

---

## Functional Requirements

1. The system should be able to load student records from a CSV file and map each row to a Student object
2. It should also load course records the same way — each row becomes a Course object
3. Students should be sortable by their full name (alphabetically)
4. Courses should be sortable by their course code
5. The system should handle edge cases in CSV data — blank rows, null fields, etc. — without crashing
6. Array utility methods (join, tail) should work correctly on string arrays
7. File size calculation should work recursively across nested directories

---

## Non-Functional Requirements

**Simplicity** — the project should be runnable with just `javac` and `java`. No build tools, no extra setup. Someone should be able to clone it and run it in under 5 minutes.

**Reliability** — if a CSV row is badly formatted or a file doesn't exist, the system shouldn't throw an unhandled exception and die. It should degrade gracefully and skip the bad data.

**Maintainability** — each class has one clear job. Adding a new sort order or a new field to Student shouldn't require touching five different files.

**Readability** — comments explain *why* something is done, not just *what* it does. Variable names are descriptive enough that you don't need to trace through the whole call chain to understand what's happening.

**Portability** — works on any OS with a JDK 17+ installation. No OS-specific paths or dependencies baked in.

**Minimal resource usage** — for the scale this operates at (a few hundred records), performance is not a concern, but the code avoids unnecessary object creation or redundant I/O operations anyway.
