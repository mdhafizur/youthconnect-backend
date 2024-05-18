package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.Kindergarten
import com.chemnitz.youthconnect.services.KindergartenService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/kindergartens")
@Api(tags = ["Kindergarten API"])
class KindergartenController(private val service: KindergartenService) {

    @GetMapping
    @ApiOperation("Get all kindergartens")
    fun getAllKindergartens(): List<Kindergarten> = service.getAllKindergartens()

    @GetMapping("/{id}")
    fun getKindergartenById(@PathVariable id: String): Kindergarten? {
        val projectId: Int = id.toIntOrNull() ?: return null
        return service.getKindergartenById(projectId)
    }

    @PostMapping
    fun createKindergarten(@RequestBody project: Kindergarten): Kindergarten = service.createKindergarten(project)

    @PutMapping("/{id}")
    fun updateKindergarten(
        @PathVariable id: String, @RequestBody project: Kindergarten
    ): Kindergarten {
        return service.updateKindergarten(project)
    }

    @DeleteMapping("/{id}")
    fun deleteKindergarten(@PathVariable id: String) {
        val projectId: Int = id.toIntOrNull() ?: return // Try to parse id to Int, return if unsuccessful
        service.deleteKindergartenById(projectId)
    }
}