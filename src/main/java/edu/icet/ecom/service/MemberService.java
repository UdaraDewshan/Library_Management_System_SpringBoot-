package edu.icet.ecom.service;

import edu.icet.ecom.model.entity.Member;
import edu.icet.ecom.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    final MemberRepository memberRepository;

    public List<Member> getAllMember() {
        return memberRepository.getAllMembers();
    }

    public String addMember(Member member) {
        return memberRepository.addMember(member);
    }

    public String removeMember(String id) {
        return memberRepository.removeMember(id);
    }
}
