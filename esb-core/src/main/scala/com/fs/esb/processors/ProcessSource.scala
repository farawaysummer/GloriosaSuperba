package com.fs.esb.processors

import com.fs.esb.env.LifeCycle
import com.fs.esb.messages.MessageContext

/**
  * @author lunar
  */
trait ProcessSource extends LifeCycle {
    def receive(mc: MessageContext): Unit
}

private[processors] class DirectProcessSource(process: MessageContext => Unit) extends ProcessSource {
    def receive(mc: MessageContext): Unit = {
        process(mc)
    }
}