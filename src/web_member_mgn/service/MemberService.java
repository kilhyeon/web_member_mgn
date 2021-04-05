package web_member_mgn.service;

import java.util.List;

import web_member_mgn.dao.Impl.MemberDaoImpl;
import web_member_mgn.ds.JndiDS;
import web_member_mgn.dto.Member;

public class MemberService {
	private MemberDaoImpl dao;

	public MemberService() {
		dao = MemberDaoImpl.getInstance();
		dao.setCon(JndiDS.getConnection());
	}

	public List<Member> showMembers() {
		return dao.selectMemberByAll();
	}

	public Member showMember(Member member) {
		return dao.selectMemberById(member);
	}

	public Member loginMember(Member member) {
		return dao.selectMemberById(member);
	}

	public void joinMember(Member member) {
		dao.joinMember(member);
	}

	public void removeMember(Member member) {
		dao.deleteMember(member);
	}
}