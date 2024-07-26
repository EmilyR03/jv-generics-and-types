public class Box <T, V extends Number & Comparable<V>> {
    // T is the type placeholder for T in all the code inside this class. Box is not T !!!
    private T storedValue;

    //Task 4 -Add a new type parameter - V - to your Box class
    private V value;


    //task 3 -create private string field in class box that will store its name
    private String name;

    // Task 4 -create a new private field - largestValue - of type V
    private V largestValue;


    //task 3 - create contructor
    public Box(String name) {
        this.name = name;
    }

    // setters and getters
    public T getStoredValue() {
        return storedValue;
    }

    public void setStoredValue(T storedValue) {
        this.storedValue = storedValue;
    }

    //Task 4 - add the getter
    public V getLargestValue() {
        return largestValue;
    }

    // Add a castValue() generic method to Box that attempts to cast a value of a different type to Box's generic type T
    public <R> T castValue(R r) { // casting new parameter R to T
        return (T) r;
    }

    //task 3 -create boolean method hasSameName
    //returns true if passed another Box
    // as an argument that has the same name as this one
    //method should employ a wildcard
    // to ensure that it can accept any type of Box
    public boolean hasSameName(Box<?, ?> anotherBox) {
        return this.name.equals(anotherBox.name);
    }

    //Task 4 Design a method - setLargestValue
    // that takes two inputs of type V
    // and sets largestValue to the value
    // of whichever input is largest

    public void setLargestValue(V value1, V value2) {
        if (value1.doubleValue() > value2.doubleValue()) {
            largestValue = value1;
        } else {
            largestValue = value2;
        }
    }
}