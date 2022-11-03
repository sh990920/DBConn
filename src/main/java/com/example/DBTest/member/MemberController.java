package com.example.DBTest.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;
    Member findMember;

    //main 페이지 get
    @GetMapping("/")
    public String main(){
        return "Main";
    }
    //main 페이지 post
    @PostMapping("/")
    public String Main(){
        return "Main";
    }
    //join 페이지 get
    @GetMapping("/join")
    public String join(){
        return "/Join";
    }
    //join 페이지 post
    @PostMapping("/join")
    public String Join(){
        return "/Join";
    }
    //login 페이지 get
    @GetMapping("/login")
    public String login(){
        return "/Login";
    }
    //login 페이지 post
    @PostMapping("/login")
    public String Login(){
        return "/Login";
    }
    //welcome 페이지 post
    //add로 추가를 하고 웰컴으로 넘어가게
    @PostMapping(path = "/add")
    public String welcome(Member member, Model model){
        memberService.save(member);
        model.addAttribute("add", member);
        return "/Welcome";
    }

    @GetMapping("/Search")
    public String search(){
        return "/Search";
    }

    //search 페이지 post
    //findMember 로 검색하고 find 로 넘어가게
    @PostMapping(path = "/findMember")
    public String findMember(Member member, Model model){
        findMember = memberService.findMember(member);
        model.addAttribute("find", findMember);
        return "/find";
    }

}
