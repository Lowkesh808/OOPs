class Main {
    public static void main(String[] args) {
        // initialize the class with Integer data
        DemoClass demo = new DemoClass();

        // We can call the generics method by placing the actual type 
        // <String/> and <Integer> inside the bracket before the method name.

        // generics method working with String
        demo.<String>genericsMethod("Java Programming");

        // We can call the generics method without writing actual data type 
        // <String/> and <Integer> inside the bracket before the method name.
        // In this case, the compiler can match the type parameter based on 
        // the value passed to the method.
        demo.genericsMethod("Java Programming");

        // generics method working with integer
        demo.<Integer>genericsMethod(25);
    }
}

class DemoClass {
    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}