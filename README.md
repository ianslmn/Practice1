# Practice1

This project approximates the value of π using the Monte Carlo method.

## Project Structure
```
PRACTICE1/
│-- .vscode/
│-- bin/
│-- lib/
│-- src/
│   │-- Practice1.java
│   │-- Practice1Main.java
│-- Practice1.jar
│-- README.md
```

## How It Works
The Monte Carlo method generates random points inside a square and counts how many fall within a quarter-circle. Using this ratio, it approximates π.

## Compilation & Execution

### Using Makefile
- **Compile the program:**
  ```sh
  make
  ```
- **Run the program:**
  ```sh
  make run
  ```
  By default, it runs with `1000000` steps. Modify as needed.

- **Create a JAR file:**
  ```sh
  make jar
  ```

- **Clean compiled files:**
  ```sh
  make clean
  ```

### Manual Compilation & Execution
- **Compile:**
  ```sh
  javac -d bin src/*.java
  ```
- **Run:**
  ```sh
  java -cp bin Practice1Main 1000000
  ```
- **Create JAR:**
  ```sh
  jar cvfe Practice1.jar Practice1Main -C bin .
  ```

