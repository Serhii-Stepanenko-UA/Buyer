package app;

public class Buyer {
    // Виправте декларацію змінних класу
    private String firstName;
    private String lastName;
    private String phone;
    // Виправте визначення конструктора
    public Buyer(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    // Пропишіть нижче getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }
}
