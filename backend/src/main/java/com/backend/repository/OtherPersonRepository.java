package com.backend.repository;

import com.backend.model.people.OtherPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherPersonRepository extends JpaRepository<OtherPerson, Long> {
}
