package com.fs.esb.env

/**
  * @author lunar
  */
trait LifeCycle {

    private[esb] var status : Int = LifeCycle.NONE

    def initialize(): Unit = {}

    def start(): Unit = {}

    def stop(): Unit = {}

    def destroy() : Unit = {}

    def isStarted: Boolean = {
        status == LifeCycle.STARTED
    }

    def isStopped: Boolean = {
        status == LifeCycle.STOPPED
    }
}

object LifeCycle {
    final val NONE = 0
    /** Object is in its initial state and not yet initialized. */
    final val INITIALIZING = 1
    /** Initialized but not yet started. */
    final val INITIALIZED = 2
    /** In the process of starting. */
    final val STARTING = 4
    /** Has started. */
    final val STARTED = 8
    /** Stopping is in progress. */
    final val STOPPING = 16
    /** Has stopped. */
    final val STOPPED = 32
    /** Destroying is in progress. */
    final val DESTROYING = 64
    /** Has destroyed, will never restarted. */
    final val DESTROYED = 128
}

