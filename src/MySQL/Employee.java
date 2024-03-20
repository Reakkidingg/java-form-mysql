package MySQL;

import java.util.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Employee {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDataOfBirth() {
        return dateOfBirth;
    }

    public void setDataOfBirth(Date dataOfBirth) {
        this.dateOfBirth = dataOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Employee (int id, String firstName, String lastName, String gender, Date dataOfBirth, double salary, String phoneNumber, String email, String address, byte[] photo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dataOfBirth;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.photo = photo;
    }

    public Employee(){
    }
    

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private double salary; 
    private String phoneNumber;
    private String email;
    private String address;
    private byte[] photo;

    public static List<Employee> getAll() throws Exception {
        List<Employee> employees = new ArrayList<>();

        String sql = "select* from tblemployee";
        Statement s = MyData.getDataCon().createStatement();
        ResultSet r = s.executeQuery(sql);
        int id;
        String firstName;
        String lastName;
        String gender;
        Date dataOfBirth;
        double salary;
        String phoneNumber;
        String email;
        String address;
        byte[] photo;
        
        while (r.next()) {
            id = r.getInt(1);
            firstName = r.getString("first_name");
            lastName=r.getString(3);
            gender=r.getString(4);
            dataOfBirth=r.getDate(5);
            salary=r.getDouble(6);
            phoneNumber=r.getString(7);
            email=r.getString(8);
            address=r.getString(9);
            photo=r.getBytes(10);
            
            employees.add(new Employee(id, firstName, lastName, gender, dataOfBirth, salary, phoneNumber, email, address, photo));
            

        }
        r.close();
        s.close();
        return employees;
    }

    public Object[] getRow() {
        DecimalFormat df1 = new DecimalFormat("0000");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        DecimalFormat df2 = new DecimalFormat("$#,##0.00");
        return new Object[]{
            df1.format(id), 
            firstName, 
            lastName,
            gender.equalsIgnoreCase("M")?"Male":"Female",
            sdf.format(dateOfBirth),
            df2.format(salary),
            phoneNumber,
            email,
            address
        };
    }
    
    

}