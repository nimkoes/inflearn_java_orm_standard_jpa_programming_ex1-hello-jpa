package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.List;

public class jpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            /*
            Member member = new Member();
            member.setId(2L);
            member.setName("HelloB");
            em.persist(member);
            */

            /*
            Member findMember = em.find(Member.class, 1L);
            System.out.println("findMember.id : " + findMember.getId());
            System.out.println("findMember.name : " + findMember.getName());
            System.out.println("findMember.class : " + findMember.getClass());

            findMember.setName("HelloJPA");
            */

            /*
            Member member1 = em.find(Member.class, 1L);
            Member member2 = em.find(Member.class, 1L);

            System.out.println("result : " + (member1 == member2));

            member1.setName("HiJPA");
            System.out.println("member1 name : " + member1.getName());
            System.out.println("member2 name : " + member2.getName());
             */

            /*
            Member member = em.find(Member.class, 1L);
            member.setName("HiJPA");
            em.remove(member);
            System.out.println(" >>> " + member.getName());
             */

            /*
            //저장
            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            Member member = new Member();
            member.setName("member1");
            member.setTeam(team);
            em.persist(member);

            em.flush();
            em.clear();

            Member findMember = em.find(Member.class, member.getId());
            List<Member> members = findMember.getTeam().getMembers();

            for (Member m : members) {
                System.out.println("m : " + m.getName());
            }

            */


            /*
            Movie movie = new Movie();
            movie.setDirector("xxxxx");
            movie.setActor("ddddd");
            movie.setName("사라지다");
            movie.setPrice(40000);

            em.persist(movie);

            em.flush();
            em.clear();

            System.out.println("1===============================");
            Movie findMovie = em.find(Movie.class, movie.getId());
            System.out.println("2===============================");
            System.out.println("findMovie : " + findMovie.getName());
            System.out.println("3===============================");
            */

            Member member = new Member();
            member.setName("user1");
            member.setCreatedBy("xxxelppa");
            member.setCreatedDate(LocalDateTime.now());

            em.persist(member);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
