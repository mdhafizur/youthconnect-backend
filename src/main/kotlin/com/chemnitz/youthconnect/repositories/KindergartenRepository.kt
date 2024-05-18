package com.chemnitz.youthconnect.repositories

import com.chemnitz.youthconnect.models.Kindergarten
import org.springframework.data.mongodb.repository.MongoRepository

interface KindergartenRepository : MongoRepository<Kindergarten, Int>
