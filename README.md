Campus Course & Records Manager (CCRM)

**Author:** R UDAY CHARAN  
**Registration Number:** 24BCY10038

CCRM is a lightweight Java application for managing student records and course data at a campus level. The whole idea was to keep it simple — no external libraries, no database setup, just plain Java and a couple of CSV files. Anyone with a JDK installed should be able to get it running in a few minutes.

---

## What it does

- Load and manage student records (registration number, name, email)
- Load and manage course data (code, title, credits, instructor, semester, department)
- Sort students alphabetically by name
- Sort courses by their course code
- Handy array utilities — joining strings, slicing arrays, etc.
- Calculate the total size of files under a directory recursively
- CSV-based storage — data is stored in plain text files you can open in Excel

---

## Technologies used

- **Java 17** — the whole project is written in standard Java, no frameworks
- **Java NIO** (`java.nio.file`) — used in FileUtils for file operations
- **Java Comparator API** — used for sorting students and courses
- **CSV files** — for storing data (students.csv and courses.csv)
- **IntelliJ IDEA** — what I used to write and test the code (Eclipse works too)

---

## Requirements

- Java 17 JDK or later
- IntelliJ IDEA or Eclipse (optional, but makes things easier)
- Git (only if you're cloning the repo)

No external libraries or Maven dependencies needed.

---

## Project Structure

```
JAVA-PROJECT_24BCY10110/
├── ArrayOperations.java   # String array helpers (join, tail)
├── Comparators.java       # Sorting comparators for Student and Course
├── FileUtils.java         # Recursive file size calculator
├── students.csv           # Sample student records
├── courses.csv            # Sample course records
├── statement.md           # Project problem statement and scope
└── README.md              # This file
```

---

## Getting Started

Clone the repo:

```
git clone https://github.com/R-Uday-Charan/JAVA-PROJECT_24BCY10110.git
cd JAVA-PROJECT_24BCY10110
```

---

## Compiling

**On Linux / macOS:**

```bash
mkdir -p out
javac -d out $(find src -name "*.java")
```

**On Windows (PowerShell):**

```powershell
mkdir out
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

If the `out` folder already exists, skip the `mkdir` step.

---

## Running the Application

After compiling:

```
java -cp out edu.ccrm.cli.CCRMApplication
```

The app loads some seed data on startup so you don't have to manually add anything just to test it.

---

## How to test it

The easiest way to check things are working:

1. Compile the project using the steps above
2. Run the application — it should start without any errors
3. Check that the student and course data loads correctly from the CSV files
4. Try sorting — students should come out alphabetically, courses by code
5. Open `students.csv` or `courses.csv` in a text editor or Excel and add a new row, then re-run and see if it picks up the new data

For `FileUtils`, you can point it at any directory on your machine and it'll give you the total size of all files inside it.

---

## Data Storage

By default the app stores its data under:

```
${user.home}/ccrm-data
```

To use a different folder, update the path in `AppConfig.get().storageFolder()`.

---

## Troubleshooting

If `java` or `javac` aren't recognized, your JDK might not be on the PATH. Check with:

```
java -version
javac -version
```

Both should show Java 17 or newer. If not, add the JDK `bin` folder to your system PATH.

If you get a "class not found" error, double-check that:
- The project compiled without errors
- You're running the command from the repo root
- The `out` folder exists and has `.class` files in it

---

## Notes

- No external libraries needed — just the standard JDK
- Data lives in CSV files, so it's easy to inspect or edit manually
- Seed data is loaded automatically, so the app isn't empty on first run
- You can open the project in IntelliJ or Eclipse with Java 17 configured

---

## License

No license added yet. Will update this if needed.
