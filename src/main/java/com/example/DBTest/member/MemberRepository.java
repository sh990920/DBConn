package com.example.DBTest.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
    //이래서 인터페이스로 연결 해놓은거구나
}
