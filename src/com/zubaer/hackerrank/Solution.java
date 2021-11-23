package com.zubaer.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student a, Student b) {
				// sort by cgpa
		        if(a.getCgpa() == b.getCgpa()){
		        	// if cgpa equal, sort by fname
		        	// if fname equal, sort by id
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
		});
		
		
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}

}
