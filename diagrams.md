# Design Diagrams

**Author:** R UDAY CHARAN  
**Registration Number:** 24BCY10038

---

## System Architecture

```
+---------------------+        read         +-----------------------------+
|   Data Layer        |  ----------------> |       Java Core             |
|                     |                    |                             |
|  students.csv       |                    |  edu.ccrm.domain.Student    |
|  courses.csv        |  <---------------- |  edu.ccrm.domain.Course     |
+---------------------+      (write/export)|  edu.ccrm.util.FileUtils    |
                                           |  edu.ccrm.util.Comparators  |
                                           |  edu.ccrm.util.ArrayOps     |
                                           +------------+----------------+
                                                        |
                                                        | display
                                                        v
                                           +-----------------------------+
                                           |   CLI / Console Output      |
                                           +-----------------------------+
```

---

## Workflow Diagram

```
        [ START ]
            |
            v
    [ Load students.csv ]
            |
            v
    [ Load courses.csv ]
            |
            v
    [ Parse rows into Student and Course objects ]
            |
            v
    [ Validate records — skip malformed rows ]
            |
       +---------+
       | Sort?   |
       +---------+
       |         |
  By Name     By Code
       |         |
       v         v
  [ Comparators.byName() ]   [ Comparators.byCode() ]
            |
            v
    [ Display sorted results to console ]
            |
            v
        [ END ]
```

---

## UML Class Diagram

```
+------------------+          +--------------------+
|   Student        |          |   Course           |
+------------------+          +--------------------+
| - regNo: String  |          | - code: CourseCode |
| - name: StudentName         | - title: String    |
| - email: String  |          | - credits: int     |
+------------------+          | - instructor: String
| + regNo()        |          | - semester: String |
| + name()         |          | - department: String
| + email()        |          +--------------------+
+--------+---------+          | + code()           |
         |                    | + title()          |
         |                    | + credits()        |
         v                    +--------+-----------+
+------------------+                   |
|  StudentName     |                   v
+------------------+          +--------------------+
| - given: String  |          |   CourseCode       |
| - family: String |          +--------------------+
+------------------+          | - code: String     |
| + full(): String |          +--------------------+
+------------------+          | + code(): String   |
                              +--------------------+

+----------------------+       +----------------------+
|  Comparators         |       |  ArrayOperations     |
|  (utility, static)  |       |  (utility, static)   |
+----------------------+       +----------------------+
| + byName()           |       | + join(arr, sep)     |
| + byCode()           |       | + tail(arr)          |
+----------------------+       +----------------------+

+----------------------+
|  FileUtils           |
|  (utility, static)  |
+----------------------+
| + sizeRecursive(path)|
+----------------------+
```

---

## Use Case Diagram

```
                    [ CCRM System ]
                          |
        +-----------------+-----------------+
        |                 |                 |
        v                 v                 v
  Load student       Load course       Sort & display
  records from CSV   records from CSV  results
        |                 |                 |
        v                 v                 v
  Parse into          Parse into       Use Comparators
  Student objects     Course objects   (name / code)
        |                 |
        v                 v
   Validate rows      Validate rows
   (skip blanks)      (skip blanks)
```

---

## Sequence Diagram (simplified)

```
  App           FileUtils       Student[]      Comparators
   |                |               |               |
   |-- load CSV --->|               |               |
   |<-- raw rows ---|               |               |
   |                                               |
   |-- parse rows into Student objects ----------->|
   |<-- Student[] returned ------------------------|
   |                                               |
   |-- sort(students, byName()) ------------------>|
   |<-- sorted Student[] --------------------------|
   |                                               |
   |-- print results ----> Console                 |
```
