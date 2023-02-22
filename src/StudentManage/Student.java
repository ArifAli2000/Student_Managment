package StudentManage;

public class Student {
    private int studentId;
    private  String studentName;
    private  int studentPhone;
    private  String StudentCity;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(int studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return StudentCity;
    }

    public void setStudentCity(String studentCity) {
        StudentCity = studentCity;
    }

    public Student(int studentId, String studentName, int studentPhone, String studentCity) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.StudentCity = studentCity;
    }

    public Student(String studentName, int studentPhone, String studentCity) {
        super();
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        StudentCity = studentCity;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentPhone=" + studentPhone +
                ", StudentCity='" + StudentCity + '\'' +
                '}';
    }
}
