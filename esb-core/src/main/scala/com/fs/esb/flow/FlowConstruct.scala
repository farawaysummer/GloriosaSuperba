package com.fs.esb.flow

import com.fs.esb.common.Markup
import com.fs.esb.processors.container.ProcessorContainer

/**
  * @author lunar
  */
trait FlowConstruct extends Markup {
    val container: ProcessorContainer
}
