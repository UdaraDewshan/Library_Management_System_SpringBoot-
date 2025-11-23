package edu.icet.ecom.repository;

import edu.icet.ecom.config.HibernateUtilMember;
import edu.icet.ecom.model.entity.Member;
import org.hibernate.Session;
import java.util.List;

public class MemberRepository {

    Session session = HibernateUtilMember.getSessionFactory().openSession();

    public List<Member> getAllMembers(){
        return session.createQuery("from Member", Member.class).list();
    }

}
