package com.SandeepRKurup.library.service;

import com.SandeepRKurup.library.model.library;
import org.apache.tomcat.jni.Library;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LibraryService {
//business logic

    static HashMap<String, library> map = new HashMap<>();

    static{
        map.put("National Library",new library("National Library","Kurattikad","9048987654","Internet,Projector,Music System"));
        map.put("Muttel Library",new library("Muttel Library","Kuttemperror","8078987654","TV"));
        map.put("Mannar Library",new library("Mannar Library","Mannar","7098687654","Internet,Projector,youthClub"));
    }

    //addlib,getLib,updateLib,deleteLib,findALL

    public String addlib(library Details){
        String name = Details.getName();
        if(map.containsKey(name)){
            return "This Library Already Exist";
        }
        map.put(name,Details);
        return "New Library Added Succesfully";
    }

    public library getLib(String name){
        if(map.containsKey(name)){
            return map.get(name);
        }
        return null;
    }

    public HashMap<String,library> findAll(){return map;}

    public String deleteLib(String name){
        if(!map.containsKey(name))
            return "Library not Found";
        map.remove(name);
        return "Library Succesfully deleted";
    }

    public String updateLib(library Lib){
        String name = Lib.getName();
//        if(!map.containsKey(name)){
//           addlib(Lib);
//        }
        map.put(name,Lib);
        return "Libarary Updated Succesfully";
    }






}
