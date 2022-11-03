package com.example.DBTest.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    boolean check = false;
    Member findMember;
    @Autowired
    MemberRepository memberRepository;

    //객체 member를 db에 저장
    public String save(Member member){
        memberRepository.save(member);
        return "저장 완료";
    }

    public Member findMember(Member member){
        check = memberRepository.existsById(member.getId());
        if(check == true){
            findMember = memberRepository.findById(member.getId()).get();
            return findMember;
        }else{
            System.out.println("찾는게 없음");
            member.setId("찾는게 없음");
            return member;
        }
    }


}
