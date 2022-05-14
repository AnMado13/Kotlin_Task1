
import Helper.bytesOutput
import Helper.console
import Helper.printStreamNew
import org.junit.*

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.Parameterized



@RunWith(Parameterized::class)
class MainTest(val monthNumber: Int, val season: String) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun monthNumbers(): Collection<Array<Any>> {
            return listOf(
                    arrayOf(1, "Зима"),
                    arrayOf(2, "Зима"),
                    arrayOf(3, "Весна"),
                    arrayOf(4, "Весна"),
                    arrayOf(5, "Весна"),
                    arrayOf(6, "Лето"),
                    arrayOf(7, "Лето"),
                    arrayOf(8, "Лето"),
                    arrayOf(9, "Осень"),
                    arrayOf(10, "Осень"),
                    arrayOf(11, "Осень"),
                    arrayOf(12, "Зима")
            )
        }

        @BeforeClass
        @JvmStatic
        fun setUp() {
            System.setOut(printStreamNew)
        }

        @AfterClass
        @JvmStatic
        fun tearDown() {
            System.setOut(console)
        }
    }

    @Before
    fun prepareTest() {
        bytesOutput.reset()
        main("$monthNumber")
    }

    @After
    fun cleanupTest() {
        bytesOutput.reset()
    }

    @Test
    fun testSpring() {
        var actual = bytesOutput.toString(Charsets.UTF_8).trim()
        assertEquals("Wrong: $monthNumber is Spring", season, actual)
    }
}