package com.cmos.repository;

import com.cmos.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 13:26 2018/4/12
 * @Modified By:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
