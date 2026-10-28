package com.office.class01;

public class Member {

    // 멤버 필드
    String memberId;
    String memberPw;
    String memberMail;
    String memberPhone;

    // 기본 생성자
    public Member() {

    }

    // 회원 정보를 초기화하는 생성자
    public Member(
            String memberId,
            String memberPw,
            String memberMail,
            String memberPhone) {

        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberMail = memberMail;
        this.memberPhone = memberPhone;
    }

    // 회원 정보 출력
    public void printInfo() {

        System.out.println("MEMBER ID: " + memberId);
        System.out.println("MEMBER PW: " + memberPw);
        System.out.println("MEMBER MAIL: " + memberMail);
        System.out.println("MEMBER PHONE: " + memberPhone);
    }
}
