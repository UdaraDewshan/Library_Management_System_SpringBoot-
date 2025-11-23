package edu.icet.ecom.service;

import edu.icet.ecom.model.entity.Member;
import edu.icet.ecom.repository.MemberRepository;

import java.util.List;

public class MemberService {

    MemberRepository memberRepository = new MemberRepository();

    public List<Member> getAllMember() {
        return memberRepository.getAllMembers();
    }
}
