package com.company;

import com.company.controllers.CandidatosList;
import com.company.entities.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<student> students = new ArrayList<>();
        CandidatosList candidatosList = new CandidatosList();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        student.Status_face_to_face face_to_face = student.Status_face_to_face.PRESENCIAL;

        student student1 = new student("Antony", "México", "Cozumel", "8938494", "antony@gmail.com", true, "antony.jpg", "antony.pdf", student.Status_face_to_face.REMOTO);
        student student2 = new student("Juan", "Argentina", "Buenos Aires", "938494", "juan@gmail.com", true, "juan.jpg", "juan.pdf", student.Status_face_to_face.MIXTO);
        student student3 = new student("Pedro", "España", "Barcelona", "839494", "pedro@gmail.com", false, "pedro.jpg", "pedro.pdf", student.Status_face_to_face.PRESENCIAL);
        student student4 = new student("Ramon", "Chile", "Santiago", "773348", "ramon@gmail.com", true, "ramon.jpg", "ramon.pdf", student.Status_face_to_face.REMOTO);
        student student5 = new student("Angel", "España", "Madrid", "98493", "angel@gmail.com", false, "angel.jpg", "angel.pdf", student.Status_face_to_face.REMOTO);
        student student6 = new student("Martin", "México", "Campeche", "49473872", "martin@gmail.com", true, "martin.jpg", "martin.pdf", student.Status_face_to_face.PRESENCIAL);
        student student7 = new student("Maria", "Argentina", "Buenos Aires", "782748", "maria@gmail.com", true, "maria.jpg", "maria.pdf", student.Status_face_to_face.PRESENCIAL);
        student student8 = new student("Antony", "México", "Cozumel", "8938494", "antony@gmail.com", true, "antony.jpg", "antony.pdf", student.Status_face_to_face.REMOTO);
        student student9 = new student("Juan", "Argentina", "Buenos Aires", "938494", "juan@gmail.com", true, "juan.jpg", "juan.pdf", student.Status_face_to_face.MIXTO);
        student student10 = new student("Pedro", "España", "Barcelona", "839494", "pedro@gmail.com", false, "pedro.jpg", "pedro.pdf", student.Status_face_to_face.PRESENCIAL);
        student student11 = new student("Ramon", "Chile", "Santiago", "773348", "ramon@gmail.com", true, "ramon.jpg", "ramon.pdf", student.Status_face_to_face.REMOTO);
        student student12 = new student("Angel", "España", "Madrid", "98493", "angel@gmail.com", false, "angel.jpg", "angel.pdf", student.Status_face_to_face.REMOTO);
        student student13 = new student("Martin", "México", "Campeche", "49473872", "martin@gmail.com", true, "martin.jpg", "martin.pdf", student.Status_face_to_face.PRESENCIAL);
        student student14 = new student("Maria", "Argentina", "Buenos Aires", "782748", "maria@gmail.com", true, "maria.jpg", "maria.pdf", student.Status_face_to_face.PRESENCIAL);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);

        candidatosList.setStudentArrayList(students);


        System.out.println("Seleccione una opción: \n" +
                "1. Añadir un candidato \n" +
                "2. Borrar un candidato \n" +
                "3. filtrar candidatos por ciudad \n" +
                "4. filtrar por precendialidad \n" +
                "5. filtrar por tipo de Traslado \n" +
                "6. filtrar por ciudad, precencialidad y tipo de traslado \n" +
                "7. filtrar candidato por Email \n" +
                "8. filtrar candidato por Telefono. ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1 -> {
                System.out.println("ha seleecionado Añadir un candidato");

                System.out.println("Escriba el nombre del canditato");
                String nombre = sc.nextLine();
                System.out.println("Escriba el nombre del Pais");
                String pais = sc.nextLine();
                System.out.println("Escriba el nombre de la ciudad");
                String ciudad = sc.nextLine();
                System.out.println("Escriba el numero de telefono ");
                String telefono = sc.nextLine();
                System.out.println("Escriba el Correo del canditato");
                String email = sc.nextLine();
                System.out.println("Escriba el tipo de Traslado ( True  = Si && False = No )");
                boolean status_transfer = sc.nextBoolean();
                System.out.println("Escriba el nombre de su foto de perfil");
                String profile_picture = sc.nextLine();
                System.out.println("Escriba el nombre de CV");
                String cv_document = sc.nextLine();
                System.out.println("Escriba el Tipo de Precencialidad que desea ( presencial, mixto, remoto)");
                String presencial = sc.nextLine();


                if (presencial == "presencial"){

                    student studentCreate = new student(nombre,pais,ciudad,telefono,email,status_transfer,profile_picture,cv_document,student.Status_face_to_face.PRESENCIAL);
                    students.add(studentCreate);
                    candidatosList.setStudentArrayList(students);
                    System.out.println("Se ha registrado correctamente!");
                }else if(presencial == "mixto"){
                    student studentCreate = new student(nombre,pais,ciudad,telefono,email,status_transfer,profile_picture,cv_document,student.Status_face_to_face.MIXTO);
                    students.add(studentCreate);
                    candidatosList.setStudentArrayList(students);
                    System.out.println("Se ha registrado correctamente!");
                }else if(presencial == "remoto"){
                    student studentCreate = new student(nombre,pais,ciudad,telefono,email,status_transfer,profile_picture,cv_document,student.Status_face_to_face.REMOTO);
                    students.add(studentCreate);
                    candidatosList.setStudentArrayList(students);
                    System.out.println("Se ha registrado correctamente!");
                }
            }
            case 2 ->{
                int position = 1;
                sb.setLength(0);
                for (student candidato : candidatosList.getStudentArrayList()){
                    sb.append(position).append("._ ").append(candidato).append("\n");
                    position++;
                }
                try {
                    System.out.println("Elija al candidato que desea eliminar \n" +
                            sb);
                    int option = sc.nextInt();
                    while (option > candidatosList.getStudentArrayList().size()){
                        System.out.println("El dato que has introducido es incorrecto. \n" +
                                "Elija el candidato que desea eliminar \n" +
                                sb);
                        option = sc.nextInt();
                    }
                    System.out.println("Se ha eliminado el candidato con el email " + candidatosList.getStudentArrayList().get(option - 1).getEmail());
                    candidatosList.delete(option - 1);
                } catch (NumberFormatException e) {
                    System.out.println("Introdusca una opcion valida!");
                }
                sb.setLength(0);

            }
            case 3 ->{
                int position = 1;
                sb.setLength(0);
                System.out.println("Introdusca el nombre de la ciudad");
                String ciudad = sc.nextLine();

                if (candidatosList.filtrar(ciudad).size() < 1){
                    System.out.println("No se han encontrado candidatos con la ciudad "+ ciudad+ "instroducida!");
                } else {
                    for (int i = 0; i < candidatosList.filtrar(ciudad).size(); i++){
                        System.out.println(position+ "._ " + candidatosList.filtrar(ciudad).get(i) + " \n");
                        position++;
                    }
                }

            }
            case 4 -> {
                 int position = 1;
                 sb.setLength(0);
                System.out.println("Escriba el Tipo de Presencialidad (presencial, mixto, remoto) ");
                String opcion = sc.nextLine();

                if (opcion == "presencial"){
                    face_to_face = student.Status_face_to_face.PRESENCIAL;
                } else if (opcion == "mixto"){
                    face_to_face = student.Status_face_to_face.MIXTO;
                } else if (opcion == "remoto"){
                    face_to_face = student.Status_face_to_face.REMOTO;
                }
                if (candidatosList.filtrar(face_to_face).size() < 1) {
                    System.out.println("No se han encontrado candidatos con el dato instroducido " + face_to_face);
                } else {
                    for (int i = 0; i < candidatosList.filtrar(face_to_face).size(); i++){
                        System.out.println(position+ "._ " + candidatosList.filtrar(face_to_face).get(i)+ " \n");
                        position++;
                    }
                }

            }
            case 5 -> {
               int position = 1;

                System.out.println("Escriba si el candidado es apto para trasladarse ( true = Si & false = No");
                boolean option = sc.nextBoolean();
                if (candidatosList.filtrar(option).size() < 1) {
                    System.out.println("No se han encontrado candidatos con el dato instroducido "+ option);
                } else {
                    for (int i = 0; i < candidatosList.filtrar(option).size(); i++){
                        System.out.println(position+ "._ "+ candidatosList.filtrar(option).get(i)+" \n");
                        position++;
                    }
                }
            }

            case 6 -> {
                int position = 1;
                System.out.println("Introdusca el nombre de la ciudad");
                String ciudad = sc.nextLine();

                System.out.println("Escriba el Tipo de Presencialidad (presencial, mixto, remoto) ");
                String opcion = sc.nextLine();

                System.out.println("Escriba si el candidado es apto para trasladarse ( true = Si & false = No");
                boolean option = sc.nextBoolean();

                if (opcion == "presencial"){
                    face_to_face = student.Status_face_to_face.PRESENCIAL;
                } else if (opcion == "mixto"){
                    face_to_face = student.Status_face_to_face.MIXTO;
                } else if (opcion == "remoto"){
                    face_to_face = student.Status_face_to_face.REMOTO;
                }

                if(candidatosList.filtrar(ciudad,face_to_face,option).size() < 1){
                    System.out.println("No se han encontrado candidatos con los datos introducidos: \n" +
                            "Ciudad: "+ ciudad +"\n" +
                            "Presencialidad: " + face_to_face + "\n" +
                            "Traslado: "+ option);
                } else {
                    for (int i = 0; i < candidatosList.filtrar(ciudad,face_to_face,option).size(); i++){
                        System.out.println(position+"._ "+ candidatosList.filtrar(ciudad,face_to_face,option).get(i)+" \n");
                        position++;
                    }
                }
            }
            case 7 -> {

                System.out.println("Escriba el email del candidato");
                String email = sc.nextLine();
                if (candidatosList.buscarEmail(email).getEmail().isEmpty()){
                    System.out.println("No se encontraron candidatos con el email "+ email);
                } else {
                    System.out.println(candidatosList.buscarEmail(email));
                }
            }
            case 8 -> {

                System.out.println("Escriba el telefono del candidato");
                String telefono = sc.nextLine();
                if (candidatosList.buscarTelefono(telefono).getPhone().isEmpty()){
                    System.out.println("No se encontro candidato con el numero " + telefono);
                } else {
                    System.out.println(candidatosList.buscarTelefono(telefono));
                }
            }
            default ->
                    {
                        System.out.println("Salir del projecto 6 FC OpenBootcamp!");
                    }
        }
    }
}
