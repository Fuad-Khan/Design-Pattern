interface Prototype {
    Prototype clone();
}

class ConcretePrototype implements Prototype, Cloneable {
    private String id;
    private String type;

    // Constructor
    public ConcretePrototype(String id, String type) {
        this.id = id;
        this.type = type;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Implementing the clone method
    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();  // Can never happen
        }
    }

    // For demonstration, let's add a toString method
    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("1", "Type1");
        ConcretePrototype cloned = original.clone();

        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);

        // Modify the cloned instance
        cloned.setId("2");
        cloned.setType("Type2");

        System.out.println("After Modification:");
        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);
    }
}
