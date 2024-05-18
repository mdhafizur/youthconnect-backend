package com.chemnitz.youthconnect.services

import com.chemnitz.youthconnect.models.SocialChildProject
import com.chemnitz.youthconnect.repositories.SocialChildProjectRepository
import org.springframework.stereotype.Service

@Service
class SocialChildProjectService(private val repository: SocialChildProjectRepository) {

    fun getAllSocialChildProjects(): List<SocialChildProject> = repository.findAll()

    fun getSocialChildProjectById(id: Int): SocialChildProject? = repository.findById(id).orElse(null)

    fun createSocialChildProject(project: SocialChildProject): SocialChildProject = repository.save(project)

    fun updateSocialChildProject(project: SocialChildProject): SocialChildProject = repository.save(project)

    fun deleteSocialChildProjectById(id: Int) = repository.deleteById(id)
}
