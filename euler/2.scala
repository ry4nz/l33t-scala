var x = (0, 1)
var y = 0
while (x._1 < 4000000) {
  (x, y) = ((x._1 + 2*x._2, 2*x._1 + 3*x._2), y + x._1)
}
y - x._1
