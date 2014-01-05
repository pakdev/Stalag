package com.stalag

import com.badlogic.gdx.Game

/**
 * Created by Peter Kurlak on 1/5/14.
 */
class StalagGame extends Game {
  def create(): Unit = {
    setScreen(new MenuScreen(this))
  }
}
