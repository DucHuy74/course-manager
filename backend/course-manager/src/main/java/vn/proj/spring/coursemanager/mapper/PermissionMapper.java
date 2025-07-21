package vn.proj.spring.coursemanager.mapper;

import org.mapstruct.Mapper;
import vn.proj.spring.coursemanager.dto.request.PermissionRequest;
import vn.proj.spring.coursemanager.dto.response.PermissionResponse;
import vn.proj.spring.coursemanager.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);

}

