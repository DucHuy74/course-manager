package vn.proj.spring.coursemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.proj.spring.coursemanager.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {
}
