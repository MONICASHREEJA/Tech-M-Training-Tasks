final class Main {
    final int Variable = 100;
    static final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args){
        finalMethod();
    }
}

// A final class cannot be inherited.
// A final method cannot be overridden.
// A final variable cannot be changed after initialisation.
