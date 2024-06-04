package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.SocialChildProject
import com.chemnitz.youthconnect.services.SocialChildProjectService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("data/social-child-projects")
class SocialChildProjectController(private val service: SocialChildProjectService) {

    @GetMapping
    fun getAllSocialChildProjects(): List<SocialChildProject> = service.getAllSocialChildProjects()

    @GetMapping("{id}")
    fun getSocialChildProjectById(@PathVariable id: Int): SocialChildProject? {
        return service.getSocialChildProjectById(id)
    }

    @PostMapping
    fun createSocialChildProject(@RequestBody project: SocialChildProject): SocialChildProject =
        service.createSocialChildProject(project)

    @PutMapping
    fun updateSocialChildProject(
        @RequestBody project: SocialChildProject
    ): SocialChildProject {
        return service.updateSocialChildProject(project)
    }

    @DeleteMapping("{id}")
    fun deleteSocialChildProject(@PathVariable id: Int) {
        service.deleteSocialChildProjectById(id)
    }
}