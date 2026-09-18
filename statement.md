# Project Statement

**Author:** R UDAY CHARAN  
**Registration Number:** 24BCY10038

---

## Problem Statement

So the idea came from something pretty common in college — keeping track of students and courses is kind of a mess when it's done manually. Records get mixed up, you can't easily search through them, and sorting by name or course code takes forever if you're doing it in a spreadsheet. I wanted to build something that at least handles the basics in a cleaner way using Java.

The project stores student and course data in CSV files and provides a way to load, sort and work with that data programmatically. It's not a big enterprise system or anything like that — it's more of a practical utility that actually works.

---

## Scope

What this project does:

- loads student records from a CSV and maps them to Java objects
- same for courses — each row becomes a Course object with all its fields
- you can sort students by name or courses by code
- there are a couple of array helper methods (join, tail) that I ended up needing while building this
- and a recursive file size calculator under FileUtils

What I didn't try to do:
- no GUI, everything runs through code/CLI
- didn't build enrollment logic (i.e. linking a student to specific courses) — that felt out of scope for now
- no login or auth of any kind

---

## Target Users

Mostly college staff — like a lab coordinator or an admin who just needs to load a list of students and sort through it without opening Excel. Could also work as a base for a bigger system if someone wanted to extend it. For now it's pretty self-contained.

---

## Features

- load and display student records (reg number, name, email)
- load and display course data (code, title, credits, instructor, semester, department)
- sort students alphabetically by full name
- sort courses by their course code
- join and slice string arrays with utility methods
- calculate total size of all files in a directory recursively
- data is stored in plain CSV so it's easy to inspect or modify

---

## Why I built it this way

Honestly the main reason I went with plain Java and CSV files is to keep it simple. I didn't want to pull in Maven or some external library for something this small. Anyone with a JDK should be able to compile and run it — that felt important.

I also split things into separate classes (Student, Course, CourseCode, StudentName, Comparators, etc.) because it's easier to read and change later. If I need to add a new field to Student I just change Student.java, not five different places.

---

## Objectives

What I was trying to get done with this:

- actually apply the Comparator interface from the course, not just read about it
- build proper domain classes rather than passing raw strings around everywhere
- practice using Java's file I/O (NIO) for reading files
- write utility methods that aren't tied to one specific use case — something reusable
- keep the whole thing clean enough that someone else could read through it without needing me to explain everything

I'll be honest, the domain model part took me a bit longer than expected. Getting StudentName to work with Comparators correctly needed a few iterations.

---

## Functional Requirements

1. Load student records from students.csv and convert each row into a Student object with the appropriate fields
2. Load course records from courses.csv similarly — each row becomes a Course
3. Sort a list of students by their full name (given + family) in ascending order
4. Sort a list of courses by course code alphabetically
5. When the CSV has bad rows (empty fields, null values, etc.) the system should skip them rather than crash
6. join() should combine a string array into a single string using a given separator
7. tail() should return the array without its first element — useful for skipping CSV headers
8. sizeRecursive() should walk through a directory and add up the sizes of all files inside, including nested folders

---

## Non-Functional Requirements

**It has to be runnable without any special setup.** Just javac and java. No build system, no config files to fill in. The whole point is that it should work out of the box on any machine with a JDK.

**Error handling matters.** If a file doesn't exist or a row in the CSV is missing a field, the code shouldn't just throw an exception and stop. FileUtils already handles the case where the path doesn't exist — similar thinking applies throughout.

**Each class should have one job.** I tried to follow this reasonably well. Comparators only does sorting. FileUtils only does file stuff. If the scope of a class starts creeping, it becomes harder to maintain — learned that from experience.

**Readable over clever.** I wrote the Comparator in ArrayOperations as an anonymous class on purpose even though a lambda would be shorter, just because it's clearer to read. Comments in the code try to explain the reasoning, not just restate what the line does.

**Works cross-platform.** No hardcoded Windows paths or OS-specific calls. Uses java.nio.file.Path which handles path differences automatically.

**Efficient enough for the use case.** This isn't handling millions of records. For a typical college department with a few hundred students it's fast. I didn't over-optimize, but I also didn't do anything obviously wasteful.
