package Basic;
interface DiamondConflict {
    default void display() {
        System.out.println("InterfaceA display");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("InterfaceB display");
    }
}

class DiamondConflictResolution implements DiamondConflict, InterfaceB {
    @Override
    public void display() {
        // Resolving conflict by providing specific implementation
        System.out.println("ConflictResolution display");
    }
    
    public static void main(String[] args) {
    	DiamondConflictResolution obj = new DiamondConflictResolution();
        obj.display(); // Output: ConflictResolution display
    }
}
