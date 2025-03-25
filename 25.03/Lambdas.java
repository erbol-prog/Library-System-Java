import java.util.*;
import java.util.function.*;
public class LambdaExercises {
    // Exercise 1: Functional Interface
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }


    

    public static void main(String[] args) {
        //Exercise 1:Implementing Math Operations
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operate(7, 3));
        System.out.println("Subtraction: " + subtraction.operate(7, 3));
        System.out.println("Multiplication: " + multiplication.operate(7, 3));
        System.out.println("Division: " + division.operate(12, 4));

        // Exercise 2: Predicate for even numbers
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55);
        Predicate<Integer> isOdd = num -> num % 2 != 0;
        List<Integer> oddNumbers = new ArrayList<>();
        
        for(Integer num : numbers) {
            if(isOdd.test(num)) {
                oddNumbers.add(num);
            }
        }
        System.out.println("Odd Numbers: " + oddNumbers);
        //Exercise 3:Sorting names
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
        names.sort((name1, name2) -> name2.compareTo(name1));
        System.out.println("Sorted Names: " + names);

        // Exercise 4: Function for string manipulation
        Function<String, String> transform = str -> {
            String upper = str.toUpperCase();
            String reversed = "";
            for(int i = upper.length() - 1; i >= 0; i--) {
                reversed += upper.charAt(i);
            }
            return reversed;
        };
        List<String> words = Arrays.asList("hello", "java", "lambbda");
        List<String> transformed = new ArrayList<>();
        for(String word : words) {
            transformed.add(transform.apply(word));
        }
        System.out.println("Transformed Strings:" + transformed);

        //Exercise5: Consumer to print cities
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        Consumer<String> printCity = city -> System.out.println(city);
        for(String city : cities) {
            printCity.accept(city);
        }

        System.out.println("Usingg method reference:");
        cities.forEach(System.out::println);

        //Exercise 7:BiFunction for comparisons
        BiFunction<Integer, Integer, Integer> findMax = (a, b) -> {
            if(a > b) return a;
            return b;
        };
        
        BiFunction<Integer, Integer, Integer> findMin = (a, b) -> {
            if(a < b) return a;
            return b;
        };

        int a=25;
        int b =40;
        System.out.println("Max:" +findMax.apply(a, b));
        System.out.println("Min:" + findMin.apply(a, b));
    }
}
