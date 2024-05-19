package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.School
import com.chemnitz.youthconnect.services.SchoolService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("schools")

class SchoolController(private val service: SchoolService) {

    @GetMapping
    fun getAllSchools(): List<School> = service.getAllSchools()

    @GetMapping("{id}")
    fun getSchoolById(@PathVariable id: Int): School? {
        return service.getSchoolById(id)
    }

    @PostMapping
    fun createSchool(@RequestBody project: School): School = service.createSchool(project)

    @PutMapping
    fun updateSchool(
        @RequestBody project: School
    ): School {
        return service.updateSchool(project)
    }

    @DeleteMapping("{id}")
    fun deleteSchool(@PathVariable id: Int) {
        service.deleteSchoolById(id)
    }
}