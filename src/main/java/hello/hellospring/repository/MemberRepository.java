package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    // null 처리 방법중 하나 (JAVA 8) -> Optional
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

    void clearStore();
}
