# ArrayMaker-Java

ArrayMaker-Java is a simple utility program that creates an array of sequential numbers and writes them to a specified file. This tool can be useful for developers who need to generate large arrays for testing or other purposes.

## Features

- Prompts the user for the file name and the number of elements.
- Generates an array of sequential numbers.
- Writes the array to a specified file, with each number on a new line.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A text editor or IDE (e.g., VS Code, IntelliJ IDEA).

### Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/ArrayMaker-Java.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd ArrayMaker-Java
   ```

### Usage

1. **Compile the program:**
   ```sh
   javac ArrayMaker.java
   ```

2. **Run the program:**
   ```sh
   java ArrayMaker
   ```

3. **Follow the prompts:**
   - Enter the name of the file (with `.txt` extension).
   - Enter the number of elements you want to write to the file.

### Example

```sh
Welcome to array maker for Java!
Enter the name of the file (with .txt extension): output.txt
Enter how many numbers you want to write in the file: 10
Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
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