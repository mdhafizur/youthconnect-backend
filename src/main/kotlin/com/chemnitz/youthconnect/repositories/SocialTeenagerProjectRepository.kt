package com.chemnitz.youthconnect.repositories

import com.chemnitz.youthconnect.models.SocialTeenagerProject
import org.springframework.data.mongodb.repository.MongoRepository

interface SocialTeenagerProjectRepository : MongoRepository<SocialTeenagerProject, Int>
