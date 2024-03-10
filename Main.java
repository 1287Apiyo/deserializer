import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Serialization-The process of converting an object into a byte stream
        //It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
        //For serializing the object, we call the writeObject() method of ObjectOutputStream class, and for deserialization we call the readObject() method of ObjectInputStream class.
        //This byte stream can be saved as a file or sent over a network
        //Can be sent to different machines
        //Byte file can be saved as a file(.ser)which is platform independent

        //Deserialization-reverse of converting byte stream into objects
 //Steps to serialize
        //1.Your object class should implement Serializable Interface

        //2.add   import java.io.Serializable;
        //3.FileOutputStream fileOut=new FileOutputStream(file path)
        //4.ObjectOutputStream out=new ObjectOutputStream(file out)
        //5.out.writeObject(objectName)
        //6.out.close();fileout.close)

     //create an instance of the user class
        User user=new User();
        //assign variables..that are public

        user.name="Anne";
        user.password="I<3Pizza";

        FileOutputStream fileOut=new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println("Object info saved");
    }
}
