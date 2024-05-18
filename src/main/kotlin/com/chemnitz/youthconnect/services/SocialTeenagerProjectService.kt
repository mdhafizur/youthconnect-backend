package com.chemnitz.youthconnect.services

import com.chemnitz.youthconnect.models.SocialTeenagerProject
import com.chemnitz.youthconnect.repositories.SocialTeenagerProjectRepository
import org.springframework.stereotype.Service

@Service
class SocialTeenagerProjectService(private val repository: SocialTeenagerProjectRepository) {

    fun getAllSocialTeenagerProjects(): List<SocialTeenagerProject> = repository.findAll()

    fun getSocialTeenagerProjectById(id: Int): SocialTeenagerProject? = repository.findById(id).orElse(null)

    fun createSocialTeenagerProject(project: SocialTeenagerProject): SocialTeenagerProject = repository.save(project)

    fun updateSocialTeenagerProject(project: SocialTeenagerProject): SocialTeenagerProject = repository.save(project)

    fun deleteSocialTeenagerProjectById(id: Int) = repository.deleteById(id)
}
