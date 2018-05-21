package Solution

object Main {
  def swap (string: String):String = {
    string.map { case ' ' => '_'  case '_' => ' '  case c => c }
  }

  def change (string: String):String = {
    string.flatMap { case '0' => "Zero"  case '1' => "One" case '2' => "Two" case '3' => "Many" case c => s"$c" }
  }

  abstract class Notification
  case class Email(sender: String, title: String, body: String) extends Notification
  case class SMS(caller: String, message: String) extends Notification
  case class VoiceRecording(contactName: String, link: String) extends Notification

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        s"You got an email from $email with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"you received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }

  class Feather()extends AnyRef{
    def douse():String = "Feather is dousing."
  }

  class Pen()extends AnyRef{
    def removeCap():String = "Removing the pen's cap."
  }

  class Pencil()extends AnyRef{
    def Sharpen():String = "Pencil is sharpening."
  }

  def twitchMethod(value:AnyRef): String = {
    value match {
      case obj: Feather => obj.douse()
      case obj: Pen => obj.removeCap()
      case obj: Pencil => obj.Sharpen()
      case _ => "Unknown object."
    }
  }
}