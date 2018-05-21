import Solution.Main
import org.scalatest._

class ScalaTest extends FlatSpec with Matchers {
  it should "Swap space to underscore and vice versa" in {
    val string = "_ x _ y _ z _"
    Main.swap(string) should be(" _x_ _y_ _z_ ")
  }

  it should "Change number on text" in {
    val string = "1 2 3 0"
    Main.change(string) should be("One Two Many Zero")
  }

  it should "Receives notification" in {
    val SMS = new Main.SMS("+375291927483", "Hello");
    Main.showNotification(SMS) should be("You got an SMS from +375291927483! Message: Hello")
  }

  it should "Test one for second task" in {
    Main.twitchMethod(new Main.Feather) should be("Feather is dousing.")
  }
}