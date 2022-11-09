//Scala: Lazy Evaluation

class strict {
  val e = {
  println("strict");
  9
  }
}
class LazyEval {
  lazy val l = {
    println("lazy");
    9
  }
}

object Demo {
  def main(args: Array[String]) {
    val x = new strict;
    val y = new LazyEval;

    println(x.e);
    println(y.l);
  }

}

  /*
  strict
  9
  lazy
  9

  Process finished with exit code 0
   */