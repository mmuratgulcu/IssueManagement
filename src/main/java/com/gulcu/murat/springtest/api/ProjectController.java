
package com.gulcu.murat.springtest.api;

import com.gulcu.murat.springtest.dto.ProjectDto;
import com.gulcu.murat.springtest.service.impl.ProjectServiceImpl;
import com.gulcu.murat.springtest.util.ApiPaths;
import com.gulcu.murat.springtest.util.TPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(ApiPaths.PROJECT_CTRL)
@Api(value =ApiPaths.PROJECT_CTRL, description = "Project APIs") //Dokümantasyonda controllerin isminin nasıl olacağını belirten anotasyon.
@Slf4j
public class ProjectController {

    private final ProjectServiceImpl projectService;

    @Autowired
    public ProjectController(ProjectServiceImpl projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/pagination")
    @ApiOperation(value = "Get By Pagination Operation", response = ProjectDto.class)
    public ResponseEntity<TPage<ProjectDto>> getAllByPagination(Pageable pageable) {
        TPage<ProjectDto> data = projectService.getAllPageable(pageable);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get By Id Operation",response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getById(@PathVariable(value = "id",required = true) Long id) {
        log.info("ProjectController -> Get by Id");
        log.debug("ProjectController -> Get by Id -> param "+id);
        ProjectDto projectDto = this.projectService.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @PostMapping
    @ApiOperation(value = "Create Operation",response = ProjectDto.class)
    public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto projectDto) {
        return ResponseEntity.ok(this.projectService.save(projectDto));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update Operation",response = ProjectDto.class)
    public ResponseEntity<ProjectDto> updateProject(@PathVariable(value = "id",required = true) Long id, @Valid @RequestBody ProjectDto projectDto) {
        return ResponseEntity.ok(this.projectService.update(id,projectDto));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete Operation",response = Boolean.class)
    public ResponseEntity<Boolean> deleteProject(@PathVariable(value = "id",required = true) Long id){
        return ResponseEntity.ok(this.projectService.delete(id));
    }
}
