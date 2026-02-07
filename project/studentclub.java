package project;

public class studentclub {

    private int studentId;
    private String studentName;
    private String clubName;
    private String role;

    // Constructor
    public studentclub(int studentId, String studentName, String clubName, String role) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.clubName = clubName;
        this.role = role;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getClubName() {
        return clubName;
    }

    public String getRole() {
        return role;
    }

    // Display method
    public void display() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Club Name    : " + clubName);
        System.out.println("Role         : " + role);
        System.out.println("---------------------------");
    }
}
