package com.stalag

import com.badlogic.gdx.utils.Logger

/**
 * Created by Peter Kurlak on 1/5/14.
 */
trait Logging {
	val logger = new Logger(getClass.getName, Logger.DEBUG)
}
