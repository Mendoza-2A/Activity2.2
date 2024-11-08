public class InheritanceSample {
    public static void main(String[] args) {
        
        Student student = new Student("Iladio", "Lemery", "BSIT", 2);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());

        Staff staff = new Staff("Dex", "Dacanlao", "Engineering",  100000.0);
        System.out.println("\nStaff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getAddress());
        System.out.println("Staff School: " + staff.getSchool());
        System.out.println("Staff Salary: " + staff.getSalary());
    }
}