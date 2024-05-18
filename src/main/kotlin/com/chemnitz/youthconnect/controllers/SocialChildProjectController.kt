package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.SocialChildProject
import com.chemnitz.youthconnect.services.SocialChildProjectService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/social-child-projects")
@Api(tags = ["Social Child Project API"])
class SocialChildProjectController(private val service: SocialChildProjectService) {

    @GetMapping
    @ApiOperation("Get all social teenager project")
    fun getAllSocialChildProjects(): List<SocialChildProject> = service.getAllSocialChildProjects()

    @GetMapping("/{id}")
    fun getSocialChildProjectById(@PathVariable id: String): SocialChildProject? {
        val projectId: Int = id.toIntOrNull() ?: return null
        return service.getSocialChildProjectById(projectId)
    }

    @PostMapping
    fun createSocialChildProject(@RequestBody project: SocialChildProject): SocialChildProject =
        service.createSocialChildProject(project)

    @PutMapping("/{id}")
    fun updateSocialChildProject(
        @PathVariable id: String, @RequestBody project: SocialChildProject
    ): SocialChildProject {
        return service.updateSocialChildProject(project)
    }

    @DeleteMapping("/{id}")
    fun deleteSocialChildProject(@PathVariable id: String) {
        val projectId: Int = id.toIntOrNull() ?: return // Try to parse id to Int, return if unsuccessful
        service.deleteSocialChildProjectById(projectId)
    }
}