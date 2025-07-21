package vn.proj.spring.coursemanager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import vn.proj.spring.coursemanager.dto.request.UserCreationRequest;
import vn.proj.spring.coursemanager.dto.request.UserUpdateRequest;
import vn.proj.spring.coursemanager.dto.response.UserResponse;
import vn.proj.spring.coursemanager.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}