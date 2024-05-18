package com.chemnitz.youthconnect.repositories

import com.chemnitz.youthconnect.models.School
import org.springframework.data.mongodb.repository.MongoRepository

interface SchoolRepository : MongoRepository<School, Int>
