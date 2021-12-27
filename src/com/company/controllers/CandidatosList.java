package com.company.controllers;

import com.company.entities.student;

import java.util.ArrayList;
import java.util.Objects;

public class CandidatosList {


     public ArrayList<student> studentArrayList = new ArrayList<student>();

    //  create student
    public ArrayList<student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    // delete student

    public void delete( int student) {
        studentArrayList.remove(student);
    }

    /*
      filter student
      - public ArrayList<Candidato> filtrar(String ciudad)
     */

    public ArrayList<student> filtrar(String city){
        ArrayList<student> studentCity = new ArrayList<>();
        for (student student : studentArrayList){
            if (Objects.equals(city, student.getCity())){
                studentCity.add(student);
            }
        }
        return studentCity;
    }
    /*
    - public ArrayList<Candidato> filtrar(String presencialidad)
     */

    public ArrayList<student> filtrar(student.Status_face_to_face presencialidad){

        ArrayList<student> studentFaceToFace = new ArrayList<>();

        for (student studentFace : studentArrayList){
            if (presencialidad == studentFace.getStatus_face_to_face()){
                studentFaceToFace.add(studentFace);
            }
        }
        return studentFaceToFace;
    }



    /*
     public ArrayList<Candidato> filtrar(boolean tipoTraslado)
     */

    public ArrayList<student> filtrar(boolean status_transfer){

         ArrayList<student> studentTransfer = new ArrayList<>();
         for (student studentTransf : studentArrayList){
             if (status_transfer == studentTransf.getStatus_transfer()){
                studentTransfer.add(studentTransf);
             }
         }
         return studentTransfer;
     }


     /*
     - public ArrayList<Candidato> filtrar(String ciudad, String presencialidad, boolean tipoTraslado)
      */

    public ArrayList<student> filtrar(String city, student.Status_face_to_face presencialidad, boolean status_transfer){
        ArrayList<student> studentCPS = new ArrayList<>();

        for (student studentcpt :  studentArrayList){
            if (Objects.equals(city, studentcpt.getCity()) && presencialidad == studentcpt.getStatus_face_to_face() && status_transfer == studentcpt.getStatus_transfer()){
                studentCPS.add(studentcpt);
            }
        }
        return studentCPS;
    }

    /*
    - public Candidato buscarEmail(String email)
     */

    public student buscarEmail (String email){

        student studenEmail = new student();

        for (student studentEm : studentArrayList){
            if (Objects.equals(email, studentEm.getEmail())){
                studenEmail = studentEm;
            }
        }
        return studenEmail;
    }

    /*
    - public Candidato buscarTelefono(String telefono)
     */

    public student buscarTelefono(String phone){
        student studentPhone = new student();
        for (student studentPh : studentArrayList){
            if (Objects.equals(phone, studentPh.getPhone())){
                studentPhone = studentPh;
            }
        }
        return studentPhone;
    }
}
