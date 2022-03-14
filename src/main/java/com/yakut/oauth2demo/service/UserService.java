package com.yakut.oauth2demo.service;

import com.yakut.oauth2demo.model.Users;
import com.yakut.oauth2demo.repo.UsersRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersRepo repo;

    public void processOAuthPostLogin(Users users) {
        Users existUser = repo.getUserByEmail(users.getEmail());

        if (existUser == null) {
            Users newUser = new Users();
            newUser.setId(users.getId());
            newUser.setGivenName(users.getGivenName());
            newUser.setFamilyName(users.getFamilyName());
            newUser.setEmail(users.getEmail());
            repo.save(newUser);
        }
    }
}
