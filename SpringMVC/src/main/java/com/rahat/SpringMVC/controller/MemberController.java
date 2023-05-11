package com.rahat.SpringMVC.controller;

import com.rahat.SpringMVC.exception.MemberNotFoundException;
import com.rahat.SpringMVC.model.Member;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/member")
public class MemberController {

    static ArrayList<Member> memberList = new ArrayList<>();

    static {
        memberList.add(new Member(1001, "Rahat",26));
        memberList.add(new Member(1002, "Taslim",25));
        memberList.add(new Member(1003, "Shanto",25));
        memberList.add(new Member(1004, "Rubel",24));
        memberList.add(new Member(1005, "Basher",24));
        memberList.add(new Member(1006, "Naimur",24));

    }

    @GetMapping("/get-info/{id}")
    public ResponseEntity<Object> getMemberInfo(@PathVariable Integer id)  {


        if (id == 1001){
            Member member= new Member(1001, "Rahat",26);
            return new ResponseEntity<>(member, HttpStatus.OK);

        }
        else {
            throw new MemberNotFoundException("Member not found");
        }

    }

    @GetMapping()
    public ArrayList<Member> ShowAll(){
        return this.memberList;
    }


}
