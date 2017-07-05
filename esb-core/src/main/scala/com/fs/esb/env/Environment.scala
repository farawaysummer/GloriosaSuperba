package com.fs.esb.env

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory

/**
  * @author lunar
  */
object Environment {
    lazy val environmentId: String = "demo"

    val mapper: ObjectMapper = new ObjectMapper(new YAMLFactory())


}
