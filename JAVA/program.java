/ 1. Hello World Program
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// 2. Simple Calculator
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
      System.out.print("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        double result;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
            default: result = Double.NaN;
        }
        System.out.println("Result: " + result);
    }
}
// 3. Even or Odd Checker
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println(num + (num % 2 == 0 ? " is even." : " is odd."));
    }
}
// 4. Leap Year Checker
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (isLeap ? " is a leap year." : " is not a leap year."));
    }
}
// 5. Multiplication Table
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
// 6. Data Type Demonstration
public class DataTypeDemo {
    public static void main(String[] args) {
        int i = 10;
        float f = 10.5f;
        double d = 20.99;
        char c = 'A';
        boolean b = true;
        System.out.println("int: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + b);
    }
}
// 7. Type Casting Example
public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;
        System.out.println("Double: " + d);
        System.out.println("Cast to int: " + i);
        i = 10;
        d = i;
        System.out.println("Int to double: " + d);
    }
}

// 8. Operator Precedence
public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result: " + result);
    }
}

// 9. Grade Calculator
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks out of 100: ");
        int marks = scanner.nextInt();
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';
      
System.out.println("Grade: " + grade);
    }
}

// 10. Number Guessing Game
import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = new Random().nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            if (guess < numberToGuess) System.out.println("Too low");
else if (guess > numberToGuess) System.out.println("Too high");
            else System.out.println("Correct!");
        } while (guess != numberToGuess);
    }
}
// 11. Factorial Calculator
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}

// 12. Method Overloading
public class MethodOverloading {
    static int add(int a, int b) {
return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2.5, 3.5));
        System.out.println(add(1, 2, 3));
    }
}

// 13. Recursive Fibonacci
import java.util.Scanner;

public class RecursiveFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        System.out.println(n + "th Fibonacci number is: " + fibonacci(n));
    }
}

// 14. Array Sum and Average
import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
// 15. String Reversal
import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println("Reversed string: " + reversed);
    }
}

// 16. Palindrome Checker
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
// 17. Class and Object Creation
class Car {
    String make, model;
    int year;
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);
car1.displayDetails();
        car2.displayDetails();
    }
}

// 18. Inheritance Example
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.makeSound();
        d.makeSound();
    }
}
/ 19. Interface Implementation
interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing piano");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();
        g.play();
        p.play();
    }
}

// 20. Try-Catch Example
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter dividend: ");
            int a = scanner.nextInt();
          System.out.print("Enter divisor: ");
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
/ 21. Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
}
            System.out.println("Access granted.");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
// 22. File Writing
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String input = scanner.nextLine();
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(input);
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
// 23. File Reading
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
// 24. ArrayList Example
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student names (type 'exit' to stop):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            students.add(name);
        }
        System.out.println("Student names:");
        for (String student : students) {
            System.out.println(student);
        }
}
}
// 25. HashMap Example
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID and name (ID -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            if (id == -1) break;
            scanner.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            map.put(id, name);
 }
        System.out.print("Enter ID to retrieve name: ");
        int searchId = scanner.nextInt();
        System.out.println("Name: " + map.getOrDefault(searchId, "Not found"));
    }
}
// 26. Thread Creation
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
// 27. Lambda Expressions
import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Orange");
        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println("Sorted list: " + list);
    }
}
// 28. Stream API
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
    }
}
// 29. Records
record Person(String name, int age) {}

import java.util.*;
import java.util.stream.Collectors;

public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 20),
            new Person("Charlie", 25)
        );
        List<Person> filtered = people.stream().filter(p -> p.age() > 21).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}
// 30. Pattern Matching for switch (Java 21)
public class PatternMatchingExample {
    public static void checkType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        checkType(42);
        checkType("Hello");
        checkType(3.14);
    }
}
// 31. Basic JDBC Connection
import java.sql.*;

public class BasicJDBCConnection {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
            }
            conn.close();
        } catch (SQLException e) {
System.out.println("Database error: " + e.getMessage());
        }
    }
}

// 32. Insert and Update Operations in JDBC
import java.sql.*;

class StudentDAO {
    Connection conn;
    public StudentDAO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:students.db");
    }

    public void insertStudent(int id, String name) throws SQLException {
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
 pstmt.executeUpdate();
    }

    public void updateStudent(int id, String name) throws SQLException {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
    }
}
/ 33. Transaction Handling in JDBC
import java.sql.*;

public class JDBCTransactionExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.db");
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");
            conn.commit();
            conn.close();
        } catch (SQLException e) {
 System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

// 34. Create and Use Java Modules
// This requires creating two separate directories and module-info.java files.
// com.utils/module-info.java
// module com.utils {
//     exports com.utils;
// }

/ com.greetings/module-info.java
// module com.greetings {
//     requires com.utils;
// }

// 35. TCP Client-Server Chat
import java.io.*;
import java.net.*;

// Server
class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while ((msg = in.readLine()) != null) {
            System.out.println("Client: " + msg);
            System.out.print("You: ");
            out.println(userInput.readLine());
        }
        socket.close();
        serverSocket.close();
    }
}

// Client
class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String msg;
        while (true) {
            System.out.print("You: ");
            out.println(userInput.readLine());
            msg = in.readLine();
            if (msg == null) break;
            System.out.println("Server: " + msg);
        }
        socket.close();
    }
}

// 36. HTTP Client API (Java 11+)
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.github.com"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}

// 37. Using javap to Inspect Bytecode
// Command-line usage only:
// 1. Save a class as Hello.java
// 2. Compile: javac Hello.java
// 3. Inspect bytecode: javap -c Hello

// 38. Decompile a Class File
// Use JD-GUI or CFR tool
// Example:
// 1. Write and compile Hello.java
// 2. Open Hello.class in JD-GUI to view source code

// 39. Reflection in Java
import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.ArrayList");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}

// 40. Virtual Threads (Java 21)
public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Hello from virtual thread!"));
        }
    }
}

// 41. Executor Service and Callable
import java.util.concurrent.*;

public class ExecutorCallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Task completed";
        };
Future<String> future = executor.submit(task);
        System.out.println("Result: " + future.get());
        executor.shutdown();
    }
}
