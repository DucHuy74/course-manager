package vn.proj.spring.coursemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.proj.spring.coursemanager.entity.InvalidatedToken;

public interface InvalidatedTokenRepository extends JpaRepository<InvalidatedToken, String> {
}
