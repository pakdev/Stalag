package com.stalag

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}

/**
 * Created by Peter Kurlak on 1/5/14.
 */
object Launcher extends App {
  val config = new LwjglApplicationConfiguration()
  config.title = "Stalag"
  config.useGL20 = true
  config.width = 800
  config.height = 480
  config.resizable = false

  new LwjglApplication(new StalagGame(), config)
}
