package com.didispace;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouk-d on 2018/6/29 0029.
 */
public class NullPointerExceptionDemo {

    public void testNpe(){
        Map<String,?> dataMap = null;
        String str="123";
        if (str.equals("123")){
            dataMap=getSegmentTaskDataMap();
        }else if (str.equals("4546")){
            dataMap=getSegmentTaskDataMap();
        }else {
            dataMap = new HashMap<>();
        }

        if (dataMap.containsKey("456")){

        }

    }

    public Subject getSubject(){
        Subject subjectFromDB = getSubjectFromDB();
        subjectFromDB.getName();
        return subjectFromDB;
    }


    private Map getSegmentTaskDataMap(){
        return null;
    }

   private   Subject getSubjectFromDB(){
        return null;
   }





}
