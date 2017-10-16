package entity;

import java.io.Serializable;

/**
 * @author Samuel Butta
 */
public class Record implements Serializable {

    private String id;
    private String location;
    private Person person;

    public Record(String id, String location, Person person) {
        this.id = id;
        this.location = location;
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
