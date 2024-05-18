package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.School
import com.chemnitz.youthconnect.services.SchoolService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/schools")
@Api(tags = ["School API"])
class SchoolController(private val service: SchoolService) {

    @GetMapping
    @ApiOperation("Get all schools")
    fun getAllSchools(): List<School> = service.getAllSchools()

    @GetMapping("/{id}")
    fun getSchoolById(@PathVariable id: String): School? {
        val projectId: Int = id.toIntOrNull() ?: return null
        return service.getSchoolById(projectId)
    }

    @PostMapping
    fun createSchool(@RequestBody project: School): School = service.createSchool(project)

    @PutMapping("/{id}")
    fun updateSchool(
        @PathVariable id: String, @RequestBody project: School
    ): School {
        return service.updateSchool(project)
    }

    @DeleteMapping("/{id}")
    fun deleteSchool(@PathVariable id: String) {
        val projectId: Int = id.toIntOrNull() ?: return // Try to parse id to Int, return if unsuccessful
        service.deleteSchoolById(projectId)
    }
}