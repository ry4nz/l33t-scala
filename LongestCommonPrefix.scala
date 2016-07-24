/*
 * Longest Common Prefix 
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
object Solution extends App {
  def solution(xs: List[String]): String = xs reduce g
  def g(x: String, y: String): String = (x zip y takeWhile {z => z._1 == z._2} map (_._1)).mkString
}
