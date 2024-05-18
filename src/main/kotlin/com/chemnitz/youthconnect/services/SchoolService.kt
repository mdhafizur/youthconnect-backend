package com.chemnitz.youthconnect.services

import com.chemnitz.youthconnect.models.School
import com.chemnitz.youthconnect.repositories.SchoolRepository
import org.springframework.stereotype.Service

@Service
class SchoolService(private val repository: SchoolRepository) {

    fun getAllSchools(): List<School> = repository.findAll()

    fun getSchoolById(id: Int): School? = repository.findById(id).orElse(null)

    fun createSchool(project: School): School = repository.save(project)

    fun updateSchool(project: School): School = repository.save(project)

    fun deleteSchoolById(id: Int) = repository.deleteById(id)
}
