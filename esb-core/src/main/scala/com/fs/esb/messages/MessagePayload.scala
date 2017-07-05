package com.fs.esb.messages

/**
  * @author lunar
  */
private[esb] trait MessagePayload extends Serializable {
    private[messages] def init(payload: Any): MessagePayload

    def set(payload: Any): Unit

    def original: Any

    def get: Option[Any]

}
