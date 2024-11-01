package com.summit.codeworks.repository;

import com.summit.codeworks.model.UserQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserQueryRepository extends JpaRepository<UserQuery, Long> {
}
