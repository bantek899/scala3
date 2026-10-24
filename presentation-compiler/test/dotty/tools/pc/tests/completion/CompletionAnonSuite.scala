package dotty.tools.pc.tests.completion

import dotty.tools.pc.base.BaseCompletionSuite

import org.junit.Test

class CompletionAnonSuite extends BaseCompletionSuite:

  @Test def `func` =
    check(
      """
        | object Main {
        |   def foo() = 
        |       List((1,2), (3,4)).map {
        |           (ab, _) => x@@
        |    }
        | }
        |""".stripMargin,
      ""
    )
