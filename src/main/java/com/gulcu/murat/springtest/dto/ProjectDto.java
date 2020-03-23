package com.gulcu.murat.springtest.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Project Data Transfer Object") //Swagger modeli olduğunu belirten anotasyon.
public class ProjectDto {
    @ApiModelProperty(value = "Project ID")
    private Long id;
    @NotNull
    @ApiModelProperty(value = "Name Of Project",required = true)
    private String projectName;
    @NotNull
    @ApiModelProperty(value = "Code of Project",required = true)
    private String projectCode;
}