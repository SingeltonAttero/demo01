package learning.topic.book.topic_1

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPosition
import java.math.BigInteger


@Composable
@Preview
fun FibScreen() {
    Column {
        LazyColumn(horizontalAlignment = Alignment.CenterHorizontally) {
            item {
                createFibNumber(1000).forEach {
                    Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = it.toString()
                    )
                }

            }
        }
    }
}

fun fob2(fib: Int): Int {
    if (fib < 2) return fib
    return fob2(fib - 1) + fob2(fib - 2)
}

fun createFibNumber(count: Long): List<BigInteger> {
    var nextFib = BigInteger("1")
    var lastFib = BigInteger("0")
    return (2..count).map {
        val oldTmp = lastFib
        lastFib = nextFib
        nextFib += oldTmp
        oldTmp
    }.toList()
}
