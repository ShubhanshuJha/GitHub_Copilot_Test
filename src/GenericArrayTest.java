import java.util.Arrays;
import java.util.Random;

public class GenericArrayTest {
    public static void main(String[] args) {
        Array<Integer> array = new Array<Integer>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(100));
        }
        System.out.println(array);
        // Write code to create an object of type Array<String>.
        Array<String> array2 = new Array<String>(10);
        // Add some string values to the array array2 and print it.
        for (int i = 0; i < 10; i++) {
            array2.add("Hello");
        }
        System.out.println(array2);

        // Write code to create an object of type Array<Double>.
        Array<Double> array3 = new Array<Double>(10);
        // Add some double values to the array array3 and print it.
        for (int i = 0; i < 10; i++) {
            array3.add(random.nextDouble());
        }
        System.out.println(array3);

        // Write code to create an object of type Array<Character> of size equal to the length of first string in array2 and having the characters of the first string of array array2.
        Array<Character> array4 = new Array<Character>(array2.get(0).length());
        for (int i = 0; i < array2.get(0).length(); i++) {
            array4.add(array2.get(0).charAt(i));
        }
        System.out.println(array4);

        // Write code to create an object of type Array<Boolean> of size equal to the length of first string in array2 and having the boolean values of the first string of array array2.
        Array<Boolean> array5 = new Array<Boolean>(array2.get(0).length());
        for (int i = 0; i < array2.get(0).length(); i++) {
            array5.add(array2.get(0).charAt(i) == 'H');
        }
        System.out.println(array5);

        // Write code to print the class name of the second element of array array2.
        System.out.println(array2.get(1).getClass().getName());

        // Write code to print the variable name of all array elements of array array2.
        for (int i = 0; i < array2.size(); i++) {
            System.out.println(array2.get(i).getClass().getName());
        }

        // Write code to use all the unused methods of Array<T> class.
        System.out.println(array.get(0));
        array.set(0, 100);
        System.out.println(array.get(0));
        array.remove(0);
        System.out.println(array.get(0));
        array.add(100);
        System.out.println(array.get(0));
        System.out.println(array.size());
        System.out.println(array.toString());
        System.out.println(array.hashCode());
        System.out.println(array.hashCode(2));

        // Print Bye-Bye.
        System.out.println("Bye-Bye");
    }
}
class Array<T> {
    private T[] array;

    public Array(int size) {
        array = (T[]) new Object[size];
    }
    // Write a method that builds an array of random integers and returns the array.
    public T[] buildArray(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = (T) Integer.valueOf(random.nextInt(100));
        }
        return array;
    }
    // Write a method that converts the array into string and returns the string.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item : array) {
            sb.append(item);
            sb.append(" ");
        }
        return sb.toString();
    }
    // Write a method that searches for a value in the array and returns the index of the value.
    public int search(T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    // Write a method to sort the array using arrays.sort().
    public void sort() {
        java.util.Arrays.sort(array);
    }
    public void add(T nextInt) {
        // Write logic to add the nextInt to the array.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = nextInt;
                break;
            }
        }
    }
    // Write a method to get the value at a given index.
    public T get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }
    // Write a method to set the value at a given index.
    public void set(int index, T value) {
        array[index] = value;
    }
    // Write a method to remove the value at a given index.
    public void remove(int index) {
        array[index] = null;
    }
    // Write a method to return hash code of the array.
    public int hashCode() {
        return Arrays.hashCode(array);
    }
    // Write a method to return the hash code of the value at a given index.
    public int hashCode(int index) {
        return array[index].hashCode();
    }
}