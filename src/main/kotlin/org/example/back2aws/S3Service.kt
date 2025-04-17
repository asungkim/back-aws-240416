package org.example.back2aws

interface S3Service {

    fun getBucketNames(): List<String>

}