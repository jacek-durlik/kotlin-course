package academy.learnprogramming.javacode;

public class Employee {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStartYear() {
        return startYear;
    }

    public float[] getSalaryLast3Years() {
        return salaryLast3Years;
    }

    private String firstName;
    private String lastName;
    private int startYear;
    private float[] salaryLast3Years;

    public Employee(String firstName, String lastName, int startYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startYear = startYear;
        this.salaryLast3Years = new float[3];
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setSalaryLast3Years(float[] salaryLast3Years) {
        this.salaryLast3Years = salaryLast3Years;
    }
}
