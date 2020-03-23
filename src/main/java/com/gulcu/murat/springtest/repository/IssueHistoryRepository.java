package com.gulcu.murat.springtest.repository;

import com.gulcu.murat.springtest.entities.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//Bu annotationu koymasakta olur. JpaRepository'i extend ettiğinde otomatik bu annotation varmış gibi davranır.
public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
    List<IssueHistory> getByIssueIdOrderById(Long id);
}
