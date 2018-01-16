package example
import org.scalatest.{Matchers, FunSuite}

import org.scalatest._

class HelloSpec extends FunSuite with Matchers {
    Hello.greeting should be ("say hello")
  }
}
