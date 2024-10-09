# ArrayMaker-Java

ArrayMaker-Java is a simple utility program that creates an array of sequential numbers and writes them to a specified file. This tool can be useful for developers who need to generate large arrays for testing or other purposes.

## Features

- Prompts the user for the file name and the number of elements.
- Generates an array of sequential numbers.
- Writes the array to a specified file, with each number on a new line.

## Getting Started

### Prerequisites

- Java or Java Development Kit (JDK) installed on your machine.
- A text editor or IDE (e.g., VS Code, IntelliJ IDEA).

### Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/hassanraza2008/ArrayMaker-Java.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd ArrayMaker-Java
   ```

### Usage

1. **Compile the program with:**
   ```sh
   javac ArrayMaker.java
   ```

2. **Run the program with CLI:**
   ```sh
   java ArrayMaker <file-name> <number-of-elements>
   ```

### Example

```sh
java ArrayMaker output.txt 10
```

The program will create a file named `output.txt` with the following content:
```
1
2
3
4
5
6
7
8
9
10
```

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Inspired by the need for simple array generation tools.
- Thanks to all contributors and users for their support.
