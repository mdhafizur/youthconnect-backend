package com.chemnitz.youthconnect.repositories

import com.chemnitz.youthconnect.models.SocialChildProject
import org.springframework.data.mongodb.repository.MongoRepository

interface SocialChildProjectRepository : MongoRepository<SocialChildProject, Int>
