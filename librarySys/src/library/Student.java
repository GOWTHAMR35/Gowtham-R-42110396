package library;

public class Student {
	    int studentId;
	    String name;
	    public Student(int studentId, String name) {
	        this.studentId = studentId;
	        this.name = name;
	    }
	    public int getStudentId() {
	        return studentId;
	    }
	    public String getName() {
	        return name;
	    }
	    public String toString() {
	        return "Student ID: " + studentId + ", Name: " + name;
	    }
	}

