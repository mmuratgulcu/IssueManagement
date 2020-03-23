package com.gulcu.murat.springtest.service;

import com.gulcu.murat.springtest.dto.ProjectDto;
import com.gulcu.murat.springtest.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(Long id);

    ProjectDto update(Long id, ProjectDto projectDto);
}
