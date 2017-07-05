package com.fs.esb.processors

import com.fs.esb.env.LifeCycle
import com.fs.esb.messages.MessageContext

/**
  * @author lunar
  */
trait ProcessSink extends LifeCycle {
    def putMessage(mc : MessageContext): Unit
}

private[processors] class DirectProcessSink extends ProcessSink {
    def putMessage(mc: MessageContext): Unit = ???
}
