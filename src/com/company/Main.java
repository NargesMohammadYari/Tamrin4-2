package com.company;
import java.awt.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<UserResume> resumeList = new ArrayList<UserResume>();
        while (true) {
            System.out.println("please enter the following case:\n1)creat resume\n2)show info");

            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    resumeList.add(Creat());
                    break;
                case 2:
                    for (UserResume U : resumeList) {
                        System.out.println(U.toString());

                        System.out.println("\n\n");
                    }
                    break;
                default:
                    System.out.println("the following number does not exist!");
            }
        }

    }

    static UserResume Creat() {
        Scanner input = new Scanner(System.in);
        UserResume U = new UserResume();

        System.out.println("enter your name:");
        U.setName(input.next());
        System.out.println("enter your Password:");
        U.setPassword(input.next());
        System.out.println("enter your ID:");
        U.setID(input.next());


        return U;
    }
   UserResume userResume=new UserResume();
    userResume.Mark();
 }