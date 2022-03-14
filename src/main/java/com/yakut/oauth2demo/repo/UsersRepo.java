package com.yakut.oauth2demo.repo;

import com.yakut.oauth2demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, String> {

    @Query("SELECT u FROM Users u WHERE u.email = :email")
    Users getUserByEmail(@Param("email") String email);
}
