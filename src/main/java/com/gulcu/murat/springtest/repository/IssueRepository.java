package com.gulcu.murat.springtest.repository;

import com.gulcu.murat.springtest.entities.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue,Long> {

}
