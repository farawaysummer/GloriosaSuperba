package com.fs.esb.processors

import com.fs.esb.common.Markup
import com.fs.esb.env.LifeCycle
import com.fs.esb.messages.MessageContext

/**
  * @author lunar
  */
abstract class MessageProcessor(@transient private[processors] val source: ProcessSource,
                                @transient private[processors] val sinks: Array[ProcessSink]) extends LifeCycle with Markup with Serializable {

    def processMessage(mc: MessageContext): Unit = {
        process(mc)

        for (sink <- sinks
             if sink.isStarted) {
        }
    }

    def process(mc: MessageContext): Unit
}
