package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.SocialTeenagerProject
import com.chemnitz.youthconnect.services.SocialTeenagerProjectService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/social-teenager-projects")
@Api(tags = ["Social Teenager Project API"])
class SocialTeenagerProjectController(private val service: SocialTeenagerProjectService) {

    @GetMapping
    @ApiOperation("Get all social teenager project")
    fun getAllSocialTeenagerProjects(): List<SocialTeenagerProject> = service.getAllSocialTeenagerProjects()

    @GetMapping("/{id}")
    fun getSocialTeenagerProjectById(@PathVariable id: String): SocialTeenagerProject? {
        val projectId: Int = id.toIntOrNull() ?: return null
        return service.getSocialTeenagerProjectById(projectId)
    }

    @PostMapping
    fun createSocialTeenagerProject(@RequestBody project: SocialTeenagerProject): SocialTeenagerProject =
        service.createSocialTeenagerProject(project)

    @PutMapping("/{id}")
    fun updateSocialTeenagerProject(
        @PathVariable id: String, @RequestBody project: SocialTeenagerProject
    ): SocialTeenagerProject {
        return service.updateSocialTeenagerProject(project)
    }

    @DeleteMapping("/{id}")
    fun deleteSocialTeenagerProject(@PathVariable id: String) {
        val projectId: Int = id.toIntOrNull() ?: return // Try to parse id to Int, return if unsuccessful
        service.deleteSocialTeenagerProjectById(projectId)
    }
}