package edu.icet.ecom.controller;

import edu.icet.ecom.model.entity.Member;
import edu.icet.ecom.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/member")
public class MemberController {

    final MemberService memberService;

    @GetMapping("/all")
    public List<Member> getAllMember(){
        return memberService.getAllMember();
    }

    @PostMapping("/add")
    public String addMember(@RequestBody Member member){
        return memberService.addMember(member);
    }

    @GetMapping("/remove={id}")
    public String removeMember(@PathVariable("id") String id){
        return memberService.removeMember(id);
    }

    @GetMapping("/search={id}")
    public Member searchMember(@PathVariable("id") String id){
        return memberService.searchMember(id);
    }
}
