package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by narges nastran on 10/24/2019.
 */
public class UserResume {
    private String Name;
    private String ID;
    private String Password;

    @Override
    public String toString(){
        return "UserResume{"+
                "your name="+Name+
                "your ID="+ID+
                "your Password"+Password+
                '}';

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
    public void Mark()
    {
        for(int i=0;i<=5;i++)
        {
            int tmp1,tmp2,tmp3,tmp4,tmp5;
            List<Integer> list=new ArrayList<>();
            tmp1= Scanner.nextInt();
            list.add(tmp1);
            tmp2= Scanner.nextInt();
            list.add(tmp2);
            tmp3= Scanner.nextInt();
            list.add(tmp3);
            tmp4= Scanner.nextInt();
            list.add(tmp4);
            tmp5= Scanner.nextInt();
            list.add(tmp5);
           for(Integer I:list){
               System.out.println(I);
           }
        }
    }
}
