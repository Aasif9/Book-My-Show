package com.example.Book.My.Show.Repository;

import com.example.Book.My.Show.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}