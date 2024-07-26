public class Box <T> {
    // T is the type placeholder for T in all the code inside this class. Box is not T !!!
    private T storedValue;

    // setters and getters
    public T getStoredValue() {
        return storedValue;
    }
    public void setStoredValue(T storedValue) {
        this.storedValue = storedValue;
    }

    // Add a castValue() generic method to Box that attempts to cast a value of a different type to Box's generic type T
    public<R> T castValue(R r) { // casting new parameter R to T
        return (T) r;
    }

}