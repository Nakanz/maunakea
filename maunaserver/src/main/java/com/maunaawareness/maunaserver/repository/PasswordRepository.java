package com.maunaawareness.maunaserver.repository;

import org.springframework.data.repository.CrudRepository;

import com.maunaawareness.maunaserver.entity.PasswordEnt;

public interface PasswordRepository extends CrudRepository<PasswordEnt, Integer> {

}
