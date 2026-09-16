Campus Course & Records Manager (CCRM)
CCRM is a simple Java application for managing campus courses and student records. The project is designed to be lightweight and easy to run using the standard Java Development Kit without any external libraries.

Requirements
* Java 17 JDK or later
* IntelliJ IDEA or Eclipse (optional)
* Git (optional, if you are cloning the repository)

No external libraries are required to run the project.

Project Structure
The source code is located inside the src directory.
The main class used to start the application is:
edu.ccrm.cli.CCRMApplication

Getting Started

Clone the repository and move into the project directory:

git clone <repository-url>
cd <project-folder>

Compiling the Project

Linux / macOS

From the repository root, run:

mkdir -p out
javac -d out $(find src -name "*.java")

The compiled files will be placed inside the out directory.

Windows PowerShell

Run:

mkdir out
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName

If the out directory already exists, you can skip the mkdir command.

#Running the Application

After compiling the project, run:

java -cp out edu.ccrm.cli.CCRMApplication

The application creates a small amount of seed data when it starts, so there is some initial data available for testing.

#Data Storage

Application data is exported to:

${user.home}/ccrm-data

The actual location depends on the user's home directory.

If you want to use a different storage location, you can change the configuration in AppConfig.

The storage path is obtained using:

AppConfig.get().storageFolder()

Change the relevant value in AppConfig to use another directory.

#Seed Data

CCRM creates minimal seed data during application startup. This is useful when running the project for the first time because you do not have to manually create all the required data before testing the application.

#Running with an IDE

The project can also be opened using IntelliJ IDEA or Eclipse.

Make sure the project is configured to use Java 17 or a newer version.

Run the following class as the main application:

edu.ccrm.cli.CCRMApplication

#Troubleshooting

If the java or javac commands are not recognized, check that the JDK is installed correctly and that Java has been added to your system PATH.

You can check the installed Java version with:

java -version
javac -version

Both commands should show Java 17 or a newer version.

If you get a class not found error while starting the application, make sure the project was compiled successfully and that you are running the command from the repository root:

java -cp out edu.ccrm.cli.CCRMApplication

Also check that the out directory contains the compiled class files.

#Configuration

The project keeps its configuration simple. The default storage directory is configured through AppConfig.

To change the storage location, update:

AppConfig.get().storageFolder()

No additional configuration files are required.

#Notes

* Java 17 or later is required.
* No external libraries are required.
* The application uses the user's home directory for data storage by default.
* Minimal seed data is created automatically at startup.
* The project can be compiled directly using javac.
* Maven is optional and is not required to build or run the project.

#License

Add the license information here if a license is added to the project.
