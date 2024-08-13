package com.myselectshop.domain.apiUseTime.repository;

import com.myselectshop.domain.apiUseTime.model.ApiUseTime;
import com.myselectshop.domain.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiUseTimeRepository extends JpaRepository<ApiUseTime, Long> {
    Optional<ApiUseTime> findByUser(User user);
}
