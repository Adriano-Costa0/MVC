package controllers;

import models.StudentModel;
import views.StudentView;

public class StudentController {

  private StudentModel model;
  private StudentView view;

  public StudentController(StudentModel model, StudentView view) {
    this.model = model;
    this.view = view;
  }

  public void setStudentName(String name) {
    model.setName(name);
  }

  public String getStudentName() {
    return model.getName();
  }

  public void setStudentRegistration(String registration) {
    model.setRegistration(registration);
  }

  public String getStudentRegistration() {
    return model.getRegistration();
  }

  public void updateView() {
    view.showStudentDetails(getStudentName(), getStudentRegistration());
  }

}
