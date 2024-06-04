package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.SocialTeenagerProject
import com.chemnitz.youthconnect.services.SocialTeenagerProjectService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("data/social-teenager-projects")
class SocialTeenagerProjectController(private val service: SocialTeenagerProjectService) {

    @GetMapping
    fun getAllSocialTeenagerProjects(): List<SocialTeenagerProject> = service.getAllSocialTeenagerProjects()

    @GetMapping("{id}")
    fun getSocialTeenagerProjectById(@PathVariable id: Int): SocialTeenagerProject? {
        return service.getSocialTeenagerProjectById(id)
    }

    @PostMapping
    fun createSocialTeenagerProject(@RequestBody project: SocialTeenagerProject): SocialTeenagerProject =
        service.createSocialTeenagerProject(project)

    @PutMapping
    fun updateSocialTeenagerProject(
        @RequestBody project: SocialTeenagerProject
    ): SocialTeenagerProject {
        return service.updateSocialTeenagerProject(project)
    }

    @DeleteMapping("{id}")
    fun deleteSocialTeenagerProject(@PathVariable id: Int) {
        service.deleteSocialTeenagerProjectById(id)
    }
}