## Problem Description :
Program can model a line based on points consisting of (x, y) coordinates using the cartesian system and program can calculate its length.

## Requirement:
The project needs these dependencies:
1) JRE/JDK 15.0.2
2) Gradle 
3) JUnit 5

## Instruction:
### How To Install
1) Clone the repository
2) Build the program
   - Use built in "build" button in IntelliJ or
   - Use command "./gradlew build" on terminal

### How To Test
1) Run the test Suite GeometryTest.java in src/test/java folder using command
```
./gradlew test
```

### How To Run
There is no main class for this program. You can import the src/main/java program to your own program
to be able to use the Line model

### How To use Line Model
To create a line:
- Make 2 points like this:
```
Point point1 = new Point(x,y)
Point point2 = new Point(x,y)
```

- Assign those 2 points to new Line
```
Line line = new Line(point1, point2)
```
