package com.thapa.jwt.repository;

import com.thapa.jwt.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserDetails, Long> {

    @Query("Select f from UserDetails  f where f.first_Name =:firstName")
    UserDetails findByFirst_Name(String firstName);

    @Query("Select f from UserDetails  f where f.password=:password")
    UserDetails findBYPassword(String password);
}
