package com.backend.repository;

import com.backend.model.items.Wand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WandRepository extends JpaRepository<Wand, Long> {
}
