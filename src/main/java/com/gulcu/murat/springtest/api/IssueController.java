
package com.gulcu.murat.springtest.api;


import com.gulcu.murat.springtest.dto.IssueDto;
import com.gulcu.murat.springtest.service.impl.IssueServiceImpl;
import com.gulcu.murat.springtest.util.ApiPaths;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(ApiPaths.ISSUE_CTRL)
//@RequiredArgsConstructor bu anotasyonu kullanmak istemezsen constructor ile final değişkene injection yapmalısın.
public class IssueController {

    private final IssueServiceImpl issueService;

    @Autowired
    public IssueController(IssueServiceImpl issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id",required = true) Long id) {
        IssueDto projectDto = issueService.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @PostMapping
    public ResponseEntity<IssueDto> createProject(@Valid @RequestBody IssueDto project){
        return ResponseEntity.ok(issueService.save(project));
    }

    @PutMapping("/{id}")
    public ResponseEntity<IssueDto> updateProject(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody IssueDto project){
        return ResponseEntity.ok(issueService.update(id,project));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){
        return  ResponseEntity.ok(issueService.delete(id));
    }
}
