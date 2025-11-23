package edu.icet.ecom.controller;

import edu.icet.ecom.model.entity.Member;
import edu.icet.ecom.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    MemberService memberService = new MemberService();

    @GetMapping("/all")
    public List<Member> getAllMember(){
        return memberService.getAllMember();
    }
}
