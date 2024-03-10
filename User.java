import java.io.Serializable;

public class User implements Serializable {

    String name;
    String password;

    //create a method

    public void sayHello() {
        System.out.println("Hello "+name);
    }
}
