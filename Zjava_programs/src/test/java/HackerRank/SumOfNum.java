package HackerRank;


	import java.util.Scanner;

	public class SumOfNum {
	    public static int calculateSum(int[] numbers) {
	        int sum = 0; // Variable to hold the sum
	        for (int num : numbers) {
	            sum += num; // Add each number to sum
	        }
	        return sum; // Return the calculated sum
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read the number of elements
	        int n = scanner.nextInt();
	        int[] numbers = new int[n]; // Initialize the array
	        
	        // Read the elements of the array
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        
	        // Call the calculateSum method and print the result
	        int result = calculateSum(numbers);
	        System.out.println(result);
	        
	        scanner.close(); // Close the scanner
	    }
	}

/*Sure! Let’s break down each step of the Java program in detail:

### Step-by-Step Explanation

#### 1. Class Definition
```java
public class Solution {
```
- This defines a public class named `Solution`. In Java, all code must be part of a class.

#### 2. Method Definition
```java
public static int calculateSum(int[] numbers) {
```
- **Method Signature**:
  - `public`: The method can be accessed from other classes.
  - `static`: This means the method belongs to the class itself rather than to instances of the class.
  - `int`: This is the return type, indicating the method will return an integer.
  - `calculateSum(int[] numbers)`: The method name is `calculateSum`, and it takes one parameter: an array of integers.

#### 3. Initialize the Sum Variable
```java
int sum = 0; // Variable to hold the sum
```
- Here, we declare an integer variable named `sum` and initialize it to `0`. This variable will hold the cumulative sum of the elements in the array.

#### 4. Loop Through the Array
```java
for (int num : numbers) {
    sum += num; // Add each number to sum
}
```
- **For-Each Loop**:
  - This loop iterates over each element in the `numbers` array.
  - `num`: Each element of the array is assigned to `num` in each iteration.
  - `sum += num;`: This adds the current element `num` to the `sum`. It’s a shorthand for `sum = sum + num`.

#### 5. Return the Result
```java
return sum; // Return the calculated sum
```
- This line returns the total sum calculated from the array back to the caller of the method.

#### 6. Main Method
```java
public static void main(String[] args) {
```
- This is the entry point of the program. Java programs start execution from the `main` method.

#### 7. Input Handling
```java
Scanner scanner = new Scanner(System.in);
```
- This creates a `Scanner` object named `scanner` to read input from the console.

#### 8. Read the Number of Elements
```java
int n = scanner.nextInt();
```
- This line reads an integer from the input, which represents the number of elements in the array. The value is stored in the variable `n`.

#### 9. Initialize the Array
```java
int[] numbers = new int[n]; // Initialize the array
```
- Here, we create an array named `numbers` of size `n`, which was read from the input. This array will hold the integer elements.

#### 10. Read the Elements of the Array
```java
for (int i = 0; i < n; i++) {
    numbers[i] = scanner.nextInt();
}
```
- This loop iterates `n` times, reading integers from input and storing them in the `numbers` array.
- `numbers[i] = scanner.nextInt();`: This line assigns the next integer input to the current index of the array.

#### 11. Call the Calculate Method
```java
int result = calculateSum(numbers);
```
- This line calls the `calculateSum` method, passing the `numbers` array as an argument. The return value (the sum) is stored in the variable `result`.

#### 12. Print the Result
```java
System.out.println(result);
```
- This prints the sum of the elements in the array to the console.

#### 13. Close the Scanner
```java
scanner.close(); // Close the scanner
```
- Finally, this closes the `scanner` to free up resources. It’s a good practice to close resources when they are no longer needed.

### Example Input and Output
If you provide the following input when prompted:
```
5
1 2 3 4 5
```
- `5` indicates that there are 5 numbers.
- The next line contains the numbers `1`, `2`, `3`, `4`, and `5`.

The program will output:
```
15
```
This is the sum of the numbers provided.

### Summary
This program demonstrates how to define methods, read input, process data, and return results in Java. Each step is designed to build towards the overall goal of calculating and displaying the sum of an array of integers.
 * 
 * */
