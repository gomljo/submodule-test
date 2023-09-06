package com.example.mainmodule.repository;

import com.example.mainmodule.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;


    @Test
    @DisplayName("저장 테스트")
    void success_saveUser(){

        // given
        User user = User.builder()
                .name("name")
                .build();

        // when
        User save = userRepository.save(user);
        // then
        assertEquals(save.getName(), "name");
    }

}