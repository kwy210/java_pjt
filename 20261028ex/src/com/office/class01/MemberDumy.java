package com.office.class01;

import java.util.HashMap;

public class MemberDumy {

    // 멤버 필드
    MemberDB db;

    // 생성자: 전달받은 DB 객체 연결
    public MemberDumy(MemberDB memberDB) {
        this.db = memberDB;
    }

    // 과제: 테스트용 회원 데이터 초기화 하기
    public void initMemberDumyData() {

        System.out.println("[MemberDumy] initMemberDumyData()");

        String[] memberIDs = {
            "gildong", "chanho", "saeri"
        };

        String[] memberPWs = {
            "1234", "5678", "9012"
        };

        String[] memberMAILs = {
            "gildong@gmail.com",
            "chanho@naver.com",
            "saeri@daum.net"
        };

        String[] memberPHONEs = {
            "010-1234-5678",
            "010-1111-2222",
            "010-3333-4444"
        };

        for (int i = 0; i < memberIDs.length; i++) {

            Member member = new Member(
                    memberIDs[i],
                    memberPWs[i],
                    memberMAILs[i],
                    memberPHONEs[i]
            );

            // 전달받은 DB에 회원 등록
            db.memberDB.put(memberIDs[i], member);
        }
    }
}