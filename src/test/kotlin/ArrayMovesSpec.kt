import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object SimpleSpec: Spek({
    given("array") {
        val array = mutableListOf(1, 1, 1)
        on("addition") {
            val result = arrayChange(array)
            it("should return 3") { assertThat(result).isEqualTo(3) }
        }

    }
})