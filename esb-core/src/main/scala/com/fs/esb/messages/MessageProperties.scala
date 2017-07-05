package com.fs.esb.messages

import com.fs.esb.messages.PropertyZone.PropertyZone

/**
  * @author lunar
  */
private[esb] trait MessageProperties extends Serializable with Cloneable {
    private[messages] def get(name: String): Any

    private[messages] def set(name: String, value: Any): MessageProperties

    private[messages] def remove(name: String): MessageProperties

    def listProperties: Array[String]

    def listProperties(zone: PropertyZone): Array[String]

}

object PropertyZone extends Enumeration {
    type PropertyZone = Value
    val VARIABLES, PROTOCOL, RESERVED = Value
}


