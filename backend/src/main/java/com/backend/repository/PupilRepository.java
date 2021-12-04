package com.backend.repository;

import com.backend.model.people.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PupilRepository extends JpaRepository<Pupil, Long> {
}
