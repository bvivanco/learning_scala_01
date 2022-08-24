package com.cookscala.traits

object Trait1 extends App {

  //trait como interface
  trait BaseSoundPlayer {
    def play

    def close

    def pause

    def stop

    def resume
  }

  trait Dog {
    def speak(whatToSay: String)

    def wagTail(enabled: Boolean)
  }

  class Mp3SoundPlayer extends BaseSoundPlayer {
    def play  {} // code here ...
    def close {} // code here ... }
    def pause {} // code here ... }
    def stop  {} // code here ... }
    def resume{} // code here ... }
  }

}
