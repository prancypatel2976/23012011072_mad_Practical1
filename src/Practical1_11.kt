class Matrix(var rows: Int, var cols: Int) {
    var data: Array<DoubleArray> = Array(rows) { DoubleArray(cols) }

    operator fun plus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Matrix dimensions must match for addition" }
        val result = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result.data[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return result
    }

    operator fun minus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Matrix dimensions must match forsubtraction" }
        val result = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result.data[i][j] = data[i][j] - other.data[i][j]
            }
        }
        return result
    }

    operator fun times(other: Matrix): Matrix {
        require(cols == other.rows) { "Number of columns in first matrix must equal number ofrows in second matrix" }
        val result = Matrix(rows, other.cols)
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                var sum = 0.0
                for (k in 0 until cols) {
                    sum += data[i][k] * other.data[k][j]
                }
                result.data[i][j] = sum
            }
        }
        return result
    }
    override fun toString(): String {
        val sb = StringBuilder()
        for (row in data) {
            sb.append(row.joinToString(separator = " "))
            sb.appendLine()
        }
        return sb.toString()
    }
}
fun main() {
    val matrix1 = Matrix(2, 2)
    matrix1.data[0][0] = 1.0
    matrix1.data[0][1] = 2.0
    matrix1.data[1][0] = 3.0
    matrix1.data[1][1] = 4.0

    val matrix2 = Matrix(2, 2)
    matrix2.data[0][0] = 5.0
    matrix2.data[0][1] = 6.0
    matrix2.data[1][0] = 7.0
    matrix2.data[1][1] = 8.0

    val sum = matrix1 + matrix2
    val difference = matrix1 - matrix2
    val product = matrix1 * matrix2

    println(sum)
    println(difference)
    println(product)
}