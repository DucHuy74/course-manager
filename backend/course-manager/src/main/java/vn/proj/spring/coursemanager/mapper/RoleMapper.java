package vn.proj.spring.coursemanager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vn.proj.spring.coursemanager.dto.request.RoleRequest;
import vn.proj.spring.coursemanager.dto.response.RoleResponse;
import vn.proj.spring.coursemanager.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);

}