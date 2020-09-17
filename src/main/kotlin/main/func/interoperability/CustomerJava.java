package main.func.interoperability;

import java.util.Objects;

public class CustomerJava {

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void prettyPrint() {
        System.out.printf("Id: %d - Name: %s", id, name);
    }

    private int id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id =" + id +
                ", name =" + name + '\'' +
                ", email =" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomerJava that = (CustomerJava) obj;

        if (id != that.id) return false;
        if (!Objects.equals(name, that.name)) return false;
        return email != null ? !email.equals(that.email) : that.email == null;
    }

}
