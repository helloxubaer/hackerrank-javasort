package com.zubaer.hackerrank;

import java.util.Comparator;

class Checker implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        if(a.getCgpa() == b.getCgpa()){
            if(a.getFname() == b.getFname()){
                return Integer.compare(a.getId(), b.getId());
            }else{
                return a.getFname().compareTo(b.getFname());
            }
        }
        if(a.getCgpa() < b.getCgpa()){
            return 1;
        }else{
            return -1;
        }
    }
}
