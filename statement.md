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
