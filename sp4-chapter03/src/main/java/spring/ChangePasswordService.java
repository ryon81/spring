package spring;

public class ChangePasswordService 
{
	private MemberDao memberDao;
	
	public ChangePasswordService(MemberDao memberDao)
	{
		this.memberDao = memberDao;
	}
	
	public void ChangePasswordService(String email, String oldpwd, String newPwd)
	{
		Member member = memberDao.selectByEmail(email);
		if(member == null)
			throw new MemberNotFoundException();
		
		member.changePassword(oldPwd, newPwd);
		
		memberDao.update(member);
	}

}
