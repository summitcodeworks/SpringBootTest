package com.summit.codeworks.service;

import com.summit.codeworks.model.UserQuery;
import com.summit.codeworks.repository.UserQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserQueryService {

    private final UserQueryRepository userQueryRepository;

    @Autowired
    public UserQueryService(UserQueryRepository userQueryRepository) {
        this.userQueryRepository = userQueryRepository;
    }

    public UserQuery save(UserQuery userQuery) {
        return userQueryRepository.save(userQuery);
    }
}
