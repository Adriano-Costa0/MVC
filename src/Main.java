import controllers.StudentController;
import models.StudentModel;
import views.StudentView;

public class Main {
  public static void main(String[] args) {
    StudentModel student = new StudentModel();
    student.setName("Adriano Costa");
    student.setRegistration("22200099911");

    System.out.println(student.getName());
    System.out.println(student.getRegistration());

    StudentView studentView = new StudentView();

    StudentController studentController = new StudentController(student, studentView);

    studentController.setStudentName("Adriano Costa Araujo Morais");
    studentController.updateView();
  }
}