package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        val trueStr = "правда"
        val falseStr = "ложь"
        'test_example - {
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(2) == "2")
            assert(Exercises.prettyBooleanFormatter1("Ку") == "Ку")
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter1(27) == "27")
            assert(Exercises.prettyBooleanFormatter1("Ку") == "Ку")
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter1(322) == "322")
            assert(Exercises.prettyBooleanFormatter1("Solo") == "Solo")
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(1, 2, 3, 4, 5, 6)) == 6)
            assert(Exercises.max1(Seq(-1, -34585, 398474, 293847593)) == 293847593)
            assert(Exercises.max1(Seq(1, 1, 1)) == 1)
            try Exercises.max1(Seq())
            catch {
                case ex: Exception => print("Empty collection")
            }
        }

        'test_max2 - {
            assert(Exercises.max2(Seq(9)) == Seq(9))
            assert(Exercises.max2(Seq(-1, 0 , 10)) == Seq(10))
            assert(Exercises.max2(Seq(1, 1, 1)) == Seq(1))
            assert(Exercises.max2(Seq()) == Seq.empty)
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(9)) == Option(9))
            assert(Exercises.max3(Seq(-1, 0 , 10)) == Option(10))
            assert(Exercises.max3(Seq(1, 1, 1)) == Option(1))
            assert(Exercises.max3(Seq()) == Option.empty)
        }

        'test_sum1 - {
            assert(Exercises.sum1(4, 8) == 12)
            assert(Exercises.sum1(-2, 78) == 76)
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-27,-35) == -62)
        }

        'test_sum2 - {
            assert(Exercises.sum1(4, 8) == 12)
            assert(Exercises.sum1(-2, 78) == 76)
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-27,-35) == -62)
        }

        'test_sum3 - {
            assert(Exercises.sum1(4, 8) == 12)
            assert(Exercises.sum1(-2, 78) == 76)
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-27,-35) == -62)
        }
    }
}
