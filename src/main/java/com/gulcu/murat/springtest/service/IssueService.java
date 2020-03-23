package com.gulcu.murat.springtest.service;

import com.gulcu.murat.springtest.dto.IssueDto;
import com.gulcu.murat.springtest.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Long issue);

    IssueDto update(Long id, IssueDto project);
}
