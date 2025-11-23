package edu.icet.ecom.repository;

import edu.icet.ecom.config.HibernateUtilMember;
import edu.icet.ecom.model.entity.Member;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepository {

    Session session = HibernateUtilMember.getSessionFactory().openSession();

    public List<Member> getAllMembers(){
        return session.createQuery("from Member", Member.class).list();
    }

    public String addMember(Member member) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.persist(member);
            transaction.commit();
            return "Member added success";
        } catch (Exception e) {
            if (transaction != null){
                transaction.rollback();
            }
            return "Something when wrong";
        }finally {
            session.close();
        }
    }


    public String removeMember(String id) {
        Transaction transaction = session.beginTransaction();
        try {
            session.remove(session.find(Member.class,id));
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            return "Something when wrong";
        }
        return "Member remove success";
    }
}
