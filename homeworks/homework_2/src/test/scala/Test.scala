import utest._
import Exercises.Vector2D

object Test extends TestSuite{

    val tests = Tests {
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
            assert(Exercises.divBy3Or7(1, 7) == Seq(3, 6, 7))
        }


        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(1, 333) == 25908)
            assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
            assert(Exercises.sumOfDivBy3Or5(-56, 46) == -258)
            assert(Exercises.sumOfDivBy3Or5(4361, 7956) == 10335881)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(8) == Seq(2))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(426) == Seq(2, 3, 71))
            assert(Exercises.primeFactor(3) == Seq(3))
            assert(Exercises.primeFactor(46738) == Seq(2, 23369))
            assert(Exercises.primeFactor(210) == Seq(2, 3, 5, 7))
            //assert(Exercises.primeFactor() == Seq())
        }

        'test_sumScalars - {
            //assert(Exercises.abs() == )
            assert(Exercises.sumScalars(Vector2D(2, 3), Vector2D(4, 6), Vector2D(2, 5), Vector2D(1, 8)) == 68)
            assert(Exercises.sumScalars(Vector2D(45, 43), Vector2D(75, 76), Vector2D(86, 17), Vector2D(49, 82)) == 12251)
        }


        'test_sumCosines - {
            assert(Exercises.sumCosines(Vector2D(5, 0), Vector2D(0, 5), Vector2D(5, 0), Vector2D(0, 5)) == 0)
        }


        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight() == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
        }
    }
}
