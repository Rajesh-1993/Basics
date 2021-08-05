package com.learning.Basics;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		RemoveDuplicates rvmd = new RemoveDuplicates();
		String[] in= {"Rajesh","kumar","sharma","Yash","Technologies","Technologies","Rajesh","Sharma"};
		rvmd.removeDups(in);
	}


	    public List<String> removeDups(String[] str){
	        List<String> unique = new ArrayList<String>();
	        int count = 0;
	        for(int i = 0; i < str.length; i++){
	            for(int j = i+1; j < str.length; j++){
	                if(str[i].equals(str[j])){
	                    count += 1;
	                }
	            }
	            if(count < 1){
	                unique.add(str[i]);
	            }
	            count = 0;
	        }
	        for(int k = 0; k < unique.size(); ){
	            System.out.println("Unique Elements: "+unique);
	            return(unique);

	        }
	        return null;
	    }
	}

