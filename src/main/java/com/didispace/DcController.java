package com.didispace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

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

     private ArrayList<String> testSTring(ArrayList<String> list){
         for (int i = 0; i <10 ; i++) {
             list.add(i+"");
         }
        return list;
     }

}
