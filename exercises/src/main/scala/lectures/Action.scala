package lectures

import scala.concurrent.ExecutionContext

object Action {
  def apply[A](action: => A): Action[A] =
    new Action[A] {
      override def execute(): A = action
    }
}

trait Action[A] {
  def execute(): A
  def retry(maxAttempt: Int): Action[A] = ???
  def onError(cb: Throwable => Any): Action[A] = ???
  def parallel(ec: ExecutionContext): Nothing = ???
}

// It is called IO in cats-effects, ZIO, monix and other libraries (it comes from Haskell)
trait IO[A] {
  def unsafeRun(): A
}