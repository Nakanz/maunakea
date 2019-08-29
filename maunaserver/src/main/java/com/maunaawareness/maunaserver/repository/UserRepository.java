package com.maunaawareness.maunaserver.repository;

import org.springframework.data.repository.CrudRepository;

import com.maunaawareness.maunaserver.entity.UserEnt;

public interface UserRepository extends CrudRepository<UserEnt, Integer> {
	UserEnt getUserEntByUsername(String username);
}
