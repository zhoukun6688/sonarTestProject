package com.didispace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

/**
 * Created by zhouk-d on 2018/6/29 0029.
 */
public class ListDemo {

    public List<String> TestList(){
        List<String> strList=testSTring(new ArrayList<>());
        if (strList!=null && strList.size()>0){
            for (String s:strList){
                if (s!=null && s.length()>0){
                    System.out.println(s);
                }
            }
        }
        return null;
    }

    private List<String> testSTring(ArrayList<String> list){

      return null;
    }
}
