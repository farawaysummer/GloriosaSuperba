package com.fs.esb.messages

import java.util.UUID
import java.util.concurrent.atomic.AtomicInteger

import com.fs.esb.exceptions.ESBFault
import com.fs.esb.processors.MessageProcessor

/**
  * @author lunar
  */
trait MessageContext extends Serializable {
    val id: String = MessageContext.generateID
    val timestamp: Long = System.currentTimeMillis

    def getPayload: Any

    def setPayload(payload: Any): MessageContext

    def getProperty(name: String): Any

    def setProperty(name: String, value: Any): Unit

    def removeProperty(name: String): Unit

    def getFault: Option[MessageFaults]

    def withFault(fault: ESBFault, processor: MessageProcessor): MessageContext
}

object MessageContext {
    val count: AtomicInteger = new AtomicInteger(0)

    private def generateID: String = UUID.randomUUID().toString
}