package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao 
{
	private static long nextId = 0;
	
	private Map<String, Member> map = new HashMap<>();
	
	public Collection<Member> selectAll()
	{
		return null;
	}
	
	public Member selectByEmail(String email)
	{
		return null;
	}
	
	public void insert(Member member)
	{
		
	}
	
	public void update(Member member)
	{
		
	}

}
