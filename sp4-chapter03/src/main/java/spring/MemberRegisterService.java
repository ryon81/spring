package spring;

import java.lang.reflect.Member;
import java.util.Date;

class MemberRegisterService 
{
	private MemberDao memberdao;
	
	public MemberRegisterService(MemberDao memberdao)
	{
		this.memberdao = memberdao;
	}
	
	public void regist(RegisterRequest req)
	{
		Member member = memberDao.selectbyEmail(req.getEmail());
		if(member != null) { throws new AlreadyExistingMemberException("dup email " + req.getEmail()); } 
		
		Member newMember = new Member(req.getEmail(),req.getPassword(),req.getName(), new Date());
		memberDao.insert(newMember);
	}

}
