package com.wildcodeschool.wildandwizard.repository;

mport com.wildcodeschool.wildandwizard.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}
