package com.office.member;

public class MemberService {

		final private MemberDao memberDao;
		
		
		final public static int SIGN_UP_FAIL     = 0;
		final public static int SIGN_UP_SUCCESS      = 1;
		
	
		public MemberService(MemberDao memberDao) {
			this.memberDao = memberDao;
		
		}

		public int singUp(MemberDto memberDto) {

			boolean isMember = memberDao.isMember(memberDto.getMemId());
			if (!isMember) {
				return memberDao.insertMember(memberDto);
			}else {
				return SIGN_UP_FAIL;
			}
			
			
		}


	public MemberDto singin(MemberDto memberDto) {

	MemberDto selectMemberDto =
			memberDao.selectMemberByMemId(memberDto.getMemId());
		
		if (selectMemberDto != null 
				&& 
				selectMemberDto.getMemPw().equals(memberDto.getMemPw())) {
			return selectMemberDto;
				
		} else {
			return null;
		}
		
	}

	
	
}
