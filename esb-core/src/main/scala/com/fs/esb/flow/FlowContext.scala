package com.fs.esb.flow

import com.fs.esb.messages.MessageContext
import com.fs.esb.processors.MessageProcessor

/**
  * @author lunar
  */
trait FlowContext {
    def markCrumb(processor: MessageProcessor): MessageContext

    def crumbs: List[String]
}
