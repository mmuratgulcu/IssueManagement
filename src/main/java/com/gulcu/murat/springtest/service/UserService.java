package com.gulcu.murat.springtest.service;


import com.gulcu.murat.springtest.dto.UserDto;
import com.gulcu.murat.springtest.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);
}
