package com.office.class01;

import java.util.Scanner;

public class MemberService {

    // 멤버 필드
    MemberDB db;

    // 생성자: 기존 DB 객체 연결
    public MemberService(MemberDB memberDB) {
        this.db = memberDB;
    }

    /*
     * 회원 가입
     */
    public void doSignUp(Scanner scanner) {

        System.out.println("Input new member ID");
        String memberId = scanner.next();

        // 과제 힌트:
        // containsKey()를 사용하여 아이디 중복 여부를 확인해 보세요.

        System.out.println("Input new member PW");
        String memberPw = scanner.next();

        System.out.println("Input new member MAIL");
        String memberMail = scanner.next();

        System.out.println("Input new member PHONE");
        String memberPhone = scanner.next();

        Member member = new Member(
                memberId,
                memberPw,
                memberMail,
                memberPhone
        );

        // 새 DB를 만들지 않고 기존 DB에 저장
        db.memberDB.put(memberId, member);

        System.out.println("회원 가입 완료!");
        member.printInfo();

        // 과제 힌트:
        // 비밀번호 문자열의 length()를 사용하여 길이를 검사해 보세요.
    }

    /*
     * 로그인
     */
    public void doSignIn(Scanner scanner) {

        System.out.println("Input member ID");
        String memberId = scanner.next();

        System.out.println("Input member PW");
        String memberPw = scanner.next();

        // 기존 DB에서 회원 조회
        Member searchedMember = db.memberDB.get(memberId);

        // 회원이 존재하는지 먼저 확인
        if (searchedMember == null) {

            System.out.println("SIGN-IN FAIL: 존재하지 않는 ID입니다.");
            return;
        }

        // 비밀번호 비교
        if (searchedMember.memberPw.equals(memberPw)) {

            System.out.println("SIGN-IN SUCCESS!!!");

        } else {

            System.out.println("SIGN-IN FAIL: 비밀번호가 일치하지 않습니다.");
        }

        // 과제 힌트:
        // 로그인 실패 횟수를 저장하는 변수를 만들어 보세요.
        
    }

    /*
     * 회원 정보 수정
     */
    public void doModify(Scanner scanner) {

        System.out.println("Input member ID");
        String memberId = scanner.next();

        // 먼저 회원 조회
        Member searchedMember = db.memberDB.get(memberId);

        // 회원이 없는 경우 처리
        if (searchedMember == null) {

            System.out.println("존재하지 않는 ID입니다.");
            return;
        }

        // 과제 힌트:
        // 기존 비밀번호를 입력받아 인증한 뒤 수정하도록 구성해 보세요.

        System.out.println("Input new member PW");
        String memberPw = scanner.next();

        System.out.println("Input new member MAIL");
        String memberMail = scanner.next();

        System.out.println("Input new member PHONE");
        String memberPhone = scanner.next();

        // 조회한 회원 객체의 정보 수정
        searchedMember.memberPw = memberPw;
        searchedMember.memberMail = memberMail;
        searchedMember.memberPhone = memberPhone;

        System.out.println("회원 정보 수정 완료!");

        // 수정 결과 출력
        searchedMember.printInfo();
    }

    /*
     * 회원 탈퇴
     */
    public void doDelete(Scanner scanner) {

        System.out.println("Input member ID");
        String memberId = scanner.next();

        System.out.println("Input member PW");
        String memberPw = scanner.next();

        // 기존 DB에서 회원 조회
        Member searchedMember = db.memberDB.get(memberId);

        // 회원 존재 여부 확인
        if (searchedMember == null) {

            System.out.println("존재하지 않는 ID입니다.");
            return;
        }

        // 비밀번호 확인
        if (searchedMember.memberPw.equals(memberPw)) {

            db.memberDB.remove(memberId);
            System.out.println("회원 탈퇴가 완료되었습니다.");

        } else {

            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }
}