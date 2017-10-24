import org.assertj.core.api.Assertions.`in`
import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object SimpleSpec: Spek({
    given("string") {
        val inputString = "aabbb"
        on("check") {
            val result = isPalindromable(inputString)
            it("should return true") { assertThat(result).isEqualTo(true) }
        }

    }
})

object PairSpec: Spek({
    given("pairs") {
        val yourLeft = 15
        val yourRight = 10
        val friendsLeft = 10
        val friendsRight = 15
        on("check") {
            val result = areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight)
            it("should return true") { assertThat(result).isEqualTo(true) }
        }
    }
})

object ipv4Spec: Spek({
    given("ipString") {
        val ipString = "255.2.3.4"
        on("check") {
            val result = isIPv4Address(ipString)
            it("should return true") {
                assertThat(result).isEqualTo(true)
            }
        }
    }
})


object DiffSpec: Spek({
    given("array") {
        val inputArray = listOf(1, 3, 0, 4)
        on("check") {
            val result = arrayMaximalAdjacentDifference(inputArray as MutableList<Int>)
            it("should return 4") {assertThat(result).isEqualTo(4)}
        }
    }
})


