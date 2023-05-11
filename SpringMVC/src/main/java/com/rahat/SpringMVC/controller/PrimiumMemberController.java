package com.rahat.SpringMVC.controller;

import com.rahat.SpringMVC.exception.PrimiumMemberNotFoundException;
import com.rahat.SpringMVC.exception.PrimiumMemberPercentageNotFoundException;
import com.rahat.SpringMVC.model.PrimiumMember;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/primiummember")
public class PrimiumMemberController {

    @GetMapping("/get-info/{id}")
    public ResponseEntity<Object> getPrimiumMemberInfo(@PathVariable Integer id)  {
        if (id == 1001){
            PrimiumMember primiumMember= new PrimiumMember(1001, "Rahat",26,"12%");
            return new ResponseEntity<>(primiumMember, HttpStatus.OK);

        }
        else {
//            return new ResponseEntity<>( new  PrimiumMemberNotFoundException("Primium Member Not Found").getMessage(), HttpStatus.NOT_FOUND);
                throw new PrimiumMemberNotFoundException("Primium Member not found");
        }

    }

    @GetMapping("/showdiscountpercentage/{id}")
    public ResponseEntity<Object> getPrimiumMemberdiscount(@PathVariable Integer id)  {
        if (id == 1001){
            PrimiumMember primiumMember= new PrimiumMember(1001, "Rahat",26,"12%");
            return new ResponseEntity<>(primiumMember.getDiscountPercentage(), HttpStatus.CREATED);

        }
        else {
            throw new PrimiumMemberPercentageNotFoundException("Percentage of This Primium Member not found");
        }

    }


}
