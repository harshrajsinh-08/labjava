package module_3;
import java.util.Scanner;

//Data type to store date

class Date {
    int date;
    int month;
    int year;

    // function to set details for a date object
    void setDate(int d, int m, int y) {
        date = d;
        month = m;
        year = y;
    }

    // function to display date in dd/mm/yyyy format
    public String toString() {
        String str = String.format("%02d/%02d/%04d", date, month, year);
        return str;
    }
}

// Data type to store address
class Address {
    String door_no;
    String street;
    String area;
    String place;
    String state;

    // function to set details for an Address object
    void setAddress(String d, String s, String a,
            String p, String s1) {
        door_no = d;
        street = s;
        area = a;
        place = p;
        state = s1;
    }

    // function to display Address
    public String toString() {
        String str = "";
        str += door_no + ", " + street + ", ";
        str += area + ", ";
        str += place + ", ";
        str += state + ". ";
        return str;
    }
}

// Data type to store student details
class Student {
    String name;
    Date dob;
    Address presentAddress;
    Address permanentAddress;
    Date admissionDate;

    void setStudentDetails(String n, Date d, Address preA, Address permA, Date adm) {
        name = n;
        dob = d;
        presentAddress = preA;
        permanentAddress = permA;
        admissionDate = adm;
    }

    public String toString() {
        String str = "Student Details\n" + "Name:" + name + "\n";

        str += "DOB:" + dob + "\n";
        str += "Present Address:" + presentAddress + "\n";
        str += "Permanent Address:" + permanentAddress + "\n";
        str += "Admission Date:" + admissionDate + "\n";
        return str;
    }
}

public class studentdetails {
    public static void main(String[] args){
        Student s1 = new Student();
        
        Date dob1 = new Date();
        dob1.setDate(8, 3, 1990);
        Date adm1 = new Date();
        adm1.setDate(8, 7, 2012);
        Address pa1 = new Address();
        pa1.setAddress("12A", "12th Cross Street", "Anna nagar", "Chennai", "Tamil Nadu");
        Address pm1 = new Address();
        pm1.setAddress("11", "S.A Road", "Perinad", "Kollam", "Kerala");
        s1.setStudentDetails("Marsha", dob1, pa1, pm1, adm1);
        System.out.println(s1);

        Student s2 = new Student();
        Date dob2 = new Date();
        dob2.setDate(8, 3, 1992);
        Date adm2 = new Date();
        adm2.setDate(8, 7, 2012);
        Address pa2 = new Address();
        pa2.setAddress("12A", "10th Cross Street", "Peelamedu", "Coimbatore", "Tamil Nadu");
        Address pm2 = new Address();
        pm2.setAddress("11", "MG Road", "Kowdiyar", "Trivandrum", "Kerala");
        s2.setStudentDetails("Manino", dob2, pa2, pm2, adm2);
        System.out.println(s2);
    }
}