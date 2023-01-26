package com.example.todo.userapi.repository;

import com.example.todo.userapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    // 이메일로 회원 조회
    // SELECT * FROM tal_user WHERE email=?
    UserEntity findByEmail(String email);

    // 이메일 중복 검사
    // SELECT COUNT(*) FROM tal_user WHERE email=?
//    @Query("select count(*) from UserEntity u where u.email=:email")
    boolean existsByEmail(String email);
}
