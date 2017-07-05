package com.fs.esb.messages

import com.fs.esb.exceptions.ESBFault
import com.fs.esb.processors.MessageProcessor

/**
  * @author lunar
  */
class MessageFaults(processor: MessageProcessor, private val fault: ESBFault) extends Serializable {
    def code: String = fault.code
    def message: String = fault.message

    def source: String = processor.id
    def sourceName: String = processor.name


}
