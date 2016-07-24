// Valid Anagram
// Given two strings s and t, write a function to determine if t is an anagram of s.

// For example,
// s = "anagram", t = "nagaram", return true.
// s = "rat", t = "car", return false.

// Note:
// You may assume the string contains only lowercase alphabets.

object Solution extends App {
  // O(nlogn) solution
  def solution(x: String, y:String): Boolean = x.sorted == y.sorted
  // O(n) solution
  def solution2(x: String, y:String): Boolean = {
    val a = Array.ofDim[Int](26)
    x foreach (i => a(i - 'a') += 1)
    y foreach (i => a(i - 'a') -= 1)
    a forall (_ == 0)
  }
  // Functional O(n) solution
  def solution3(x: String, y:String): Boolean = {
    ((x groupBy identity).toList diff (y groupBy identity).toList).isEmpty
  }
}
