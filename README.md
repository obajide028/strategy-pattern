# Strategy Pattern

The **Strategy Pattern** is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern allows the algorithm to vary independently of the clients that use it.

It's particularly useful when you have multiple ways to perform a task or operation, and you want to be able to swap these implementations dynamically.

---

### **Concept Overview**
The **Strategy Pattern** is like giving an object multiple ways to do something and letting it pick the best way at the right time. Instead of hardcoding behaviors, you create different **strategies** (or methods) for how something should behave and allow the object to switch between these strategies.

### **Key Concepts**
- **Encapsulation of Algorithms**: Each algorithm is encapsulated into its own class.
- **Interchangeability**: The client can choose and switch algorithms at runtime without altering the code.
- **Composition over Inheritance**: Instead of using inheritance to define behavior, it uses composition to delegate behavior to different classes.

### **Advantages**
✅ **Flexibility** – Behaviors can be changed dynamically.
✅ **Reusability** – Common behaviors can be reused across different classes.
✅ **Adherence to SOLID Principles**:
- **Open/Closed Principle** – Adding new behaviors doesn't require modifying existing classes.
- **Single Responsibility Principle** – Behavior logic is encapsulated in dedicated classes.

---

## **Strategy Pattern in Action: Duck Simulation**

### **How It Works**
Instead of hardcoding **flying** and **quacking** behaviors inside the `Duck` class, we delegate them to strategy interfaces.

### **1️⃣ Define the Behavior Interfaces**
We define two separate interfaces:
- `FlyBehavior` for flying behavior
- `QuackBehavior` for quacking behavior

These interfaces allow different types of ducks to have different behaviors **without modifying the main `Duck` class**.

### **2️⃣ Create behaviors_imp Implementations**
Now, we implement different flying and quacking strategies. Each concrete class implements the interface separately, allowing flexibility when assigning behaviors.

### **3️⃣ Modify the Duck Class to Use Strategies**
The `Duck` class will now **delegate its behavior** to the strategy interfaces instead of implementing them directly.

- The `Duck` class no longer contains hardcoded flying and quacking logic.
- Instead, it **delegates behaviors** to `flyBehavior` and `quackBehavior`.
- We can **dynamically change** a duck’s behavior at runtime using `setFlyBehavior()` and `setQuackBehavior()`.

### **4️⃣ Create Specific Duck Types**
We now define specific duck types with default behaviors.

Each duck type can have different behaviors **without modifying the main `Duck` class**.

---

## **Conclusion**
The **Strategy Pattern** helps us create more flexible and maintainable code by **encapsulating behavior into separate classes**. This makes it easy to **add new behaviors** without modifying existing code, ensuring that our system follows **SOLID design principles**.

By applying this pattern to the **Duck Simulation**, we have made it possible for different types of ducks to have unique behaviors while keeping the code **clean, reusable, and scalable**. 🚀

