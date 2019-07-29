package com.stackroute;
import java.util.*;
    public class SortedSetExample {
        public String sortArrayListUsingSortedSet(String string){
            if (string==null)return null;
            SortedSet<String> sortedSet=new TreeSet<>(Arrays.asList(string.split(" ")));

            return new ArrayList<String>(sortedSet).toString();
        }

    }
