package com.office.member;

public class MemberService implements IMemberService{

	final MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	

	
	@Override
	public void signUp(MemberDto memberDto) {
		
		// 아이디 중복 체크
	boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		// 회원가입 
		if (!isMember) {
		int result = memberDao.insertNewMember(memberDto); // 0:실패 , 1:성공
			
			if (result == 0) {
				System.out.println("죄송합니다. 회원가입 실패입니다. 잠시후 다시 시도해주세요.");
				
			}else {
				System.out.println("회원가입 성공했습니다.");
			}
		
		} else {
			System.out.println("이미 존재하는 ID 입니다.");
		}
		
		
	}

	@Override
	public void signIn(MemberDto memberDto) {
		
		MemberDto searchedMemberDto =
				memberDao.searchMemberByMemIdAndMemPw(memberDto);  //눈에 익혀두기
		
		if (searchedMemberDto != null) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
	}

	@Override
	public void modify(MemberDto memberDto) {
		
		MemberDto updatedMemberByMemId=
				memberDao.updatedMemberByMemId(memberDto);
		
		if (updatedMemberByMemId != null) {
			System.out.println("정보 변경 성공");
		}else {
			System.out.println("정보 변경 실패");
		}
	}

	@Override
	public void delete(MemberDto memberDto) {
		
		MemberDto deletedMemerDto = memberDao.deleteMemberByMemIdAndMemPw(memberDto);
		
		if (deletedMemerDto != null) {
			System.out.println("탈퇴처리 완료되었습니다.");
			
		} else {
			System.out.println("탈퇴처리 실패했습니다.");
			
		}
		
	}

	public Boolean doAuthenticationByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto Dto = new MemberDto();
		
		/*
		 * memberDto ==> MemberDto or null
		 */
		
		return Dto != null ? true : false;
	}

}

