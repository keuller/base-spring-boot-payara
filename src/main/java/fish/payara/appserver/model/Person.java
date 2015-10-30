package fish.payara.appserver.model;

/**
 * @author keuller.magalhaes at gmail.com
 * @version 1.0
 */
public class Person {

    public Integer id;
    
    public String firstName;
    
    public String lastName;
    
    public String email;

    public Person() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
    }
    
    public Person(int cod, String fName, String lName, String email) {
        this.id = cod;
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
    }
    
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String toString() {
        return firstName.concat(" ".concat(lastName));
    }
    
}
