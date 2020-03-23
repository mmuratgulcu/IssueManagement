package com.gulcu.murat.springtest.service;

import com.gulcu.murat.springtest.dto.IssueHistoryDto;
import com.gulcu.murat.springtest.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {

    IssueHistoryDto save(IssueHistoryDto issueHistory);

    IssueHistoryDto getById(Long id);

    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistoryDto issueHistory);
}
