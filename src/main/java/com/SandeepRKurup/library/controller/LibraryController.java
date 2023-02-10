package com.SandeepRKurup.library.controller;

import com.SandeepRKurup.library.model.library;
import com.SandeepRKurup.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("api/library/v1")
public class LibraryController {

    @Autowired
    public LibraryService libraryService;

    @GetMapping("/find_all")
    public HashMap<String, library> get_all_Library(){
      return libraryService.findAll();
    }

    @GetMapping("/find/library/{libraryName}")
    public library getLibrary(String name){
        return libraryService.getLib(name);
    }


    @PostMapping("/add_Library")
    public String AddLibrary(library newLib){
       return libraryService.addlib(newLib);
    }

    @PutMapping("/update_library")
    public String updateLibrary(library lib){
        return libraryService.updateLib(lib);
    }

    @DeleteMapping("/delete_library")
    public String deleteLibrary(String name){
        return libraryService.deleteLib(name);
    }

}
