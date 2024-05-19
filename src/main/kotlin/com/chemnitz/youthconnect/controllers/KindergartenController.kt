package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.Kindergarten
import com.chemnitz.youthconnect.services.KindergartenService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("kindergartens")
class KindergartenController(private val service: KindergartenService) {

    @GetMapping
    fun getAllKindergartens(): List<Kindergarten> = service.getAllKindergartens()

    @GetMapping("{id}")
    fun getKindergartenById(@PathVariable id: Int): Kindergarten? {
        return service.getKindergartenById(id)
    }

    @PostMapping
    fun createKindergarten(@RequestBody project: Kindergarten): Kindergarten = service.createKindergarten(project)

    @PutMapping
    fun updateKindergarten(
        @RequestBody project: Kindergarten
    ): Kindergarten {
        return service.updateKindergarten(project)
    }

    @DeleteMapping("{id}")
    fun deleteKindergarten(@PathVariable id: Int) {
        service.deleteKindergartenById(id)
    }
}