package com.chemnitz.youthconnect.services

import com.chemnitz.youthconnect.models.Kindergarten
import com.chemnitz.youthconnect.repositories.KindergartenRepository
import org.springframework.stereotype.Service

@Service
class KindergartenService(private val repository: KindergartenRepository) {

    fun getAllKindergartens(): List<Kindergarten> = repository.findAll()

    fun getKindergartenById(id: Int): Kindergarten? = repository.findById(id).orElse(null)

    fun createKindergarten(project: Kindergarten): Kindergarten = repository.save(project)

    fun updateKindergarten(project: Kindergarten): Kindergarten = repository.save(project)

    fun deleteKindergartenById(id: Int) = repository.deleteById(id)
}

